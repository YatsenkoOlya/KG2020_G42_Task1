package com.company;

import java.awt.*;

public class Tree implements Drawable {
    /*public void drawTree(Graphics2D gr, int x, int y, int n) { // n: 1 - мал дерево, 2 - больш дерево, 3 - ёлка
        if (n == 1) {
            gr.setColor(new Color(0x7B4625));
            gr.fillPolygon(new int[]{x, x + 15, x + 30}, new int[]{y, y - 90, y}, 3);

            gr.setColor(new Color(0x1D9A1D));
            gr.fillOval(x - 25, y - 80, 46, 46);
            gr.fillOval(x - 10, y - 100, 30, 30);
            gr.fillOval(x + 10, y - 105, 40, 40);
            gr.fillOval(x + 10, y - 75, 50, 50);
        }
        if (n == 2) {
            gr.setColor(new Color(0x7B4625));
            gr.fillPolygon(new int[] {x, x + 20, x + 40}, new int[] {y, y - 175, y}, 3);

            gr.setColor(new Color(0x207D09));
            gr.fillOval(x - 35,y - 110,60,60);
            gr.fillOval(x - 25,y - 150,54,54);
            gr.fillOval(x - 5,y - 175,50,50);
            gr.fillOval(x + 20,y - 150,40,40);
            gr.fillOval(x + 15,y - 125,50,50);
        }
        if (n == 3) {
            gr.setColor(new Color(0x794F03));
            gr.fillRect(x + 25, y - 20, 10, 10);
            gr.setColor(new Color(0x195505));
            gr.fillPolygon(new int[]{x, x + 20, x + 10, x + 25, x + 20, x + 30, x + 40, x + 35, x + 50, x + 40, x + 60},
                    new int[]{y - 20, y - 50, y - 50, y - 80, y - 80, y - 100, y - 80, y - 80, y - 50, y - 50, y - 20}, 11);
        }
    }*/

    private int x, y, n;
    public Tree (int x, int y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }

    @Override
    public void draw(Graphics2D gr) { // n: 1 - мал дерево, 2 - больш дерево, 3 - ёлка
        if (n == 1) {
            gr.setColor(new Color(0x7B4625));
            gr.fillPolygon(new int[]{x, x + 15, x + 30}, new int[]{y, y - 90, y}, 3);

            gr.setColor(new Color(0x1D9A1D));
            gr.fillOval(x - 25, y - 80, 46, 46);
            gr.fillOval(x - 10, y - 100, 30, 30);
            gr.fillOval(x + 10, y - 105, 40, 40);
            gr.fillOval(x + 10, y - 75, 50, 50);
        }
        if (n == 2) {
            gr.setColor(new Color(0x7B4625));
            gr.fillPolygon(new int[] {x, x + 20, x + 40}, new int[] {y, y - 175, y}, 3);

            gr.setColor(new Color(0x207D09));
            gr.fillOval(x - 35,y - 110,60,60);
            gr.fillOval(x - 25,y - 150,54,54);
            gr.fillOval(x - 5,y - 175,50,50);
            gr.fillOval(x + 20,y - 150,40,40);
            gr.fillOval(x + 15,y - 125,50,50);
        }
        if (n == 3) {
            gr.setColor(new Color(0x794F03));
            gr.fillRect(x + 25, y - 20, 10, 10);
            gr.setColor(new Color(0x195505));
            gr.fillPolygon(new int[]{x, x + 20, x + 10, x + 25, x + 20, x + 30, x + 40, x + 35, x + 50, x + 40, x + 60},
                    new int[]{y - 20, y - 50, y - 50, y - 80, y - 80, y - 100, y - 80, y - 80, y - 50, y - 50, y - 20}, 11);
        }
    }
}
