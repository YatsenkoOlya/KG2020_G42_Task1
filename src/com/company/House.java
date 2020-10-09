package com.company;

import java.awt.*;

public class House implements Drawable {
   /* public void drawHouse(Graphics2D gr, int x, int y, int floorCount, Color c1, Color c2, Color c3, Color c4) { // c1-дом; с2-труба ;с3-дверь,крыша; c4-окна;
        gr.setColor(c1);
        gr.fillRect(x, y - floorCount * 100, 190, floorCount * 100);
        if (floorCount == 1) {
            gr.setColor(new Color(0xE6E4EFEF, true));
            gr.fillOval(x + 140, y - 180, 20, 20);
            gr.fillOval(x + 120, y - 210, 40, 40);
            gr.fillOval(x + 135, y - 225, 30, 30);
            gr.setColor(c2);
            gr.fillPolygon(new int[]{x + 140, x + 160, x + 160, x + 140}, new int[]{y - 120, y - 120, y - 170, y - 170}, 4);
        }
        gr.setColor(c3);
        gr.fillRect(x + 80, y - 50, 30, 50);
        gr.fillPolygon(new int[]{x, x + 70, x + 120, x + 190}, new int[]{y - floorCount * 100, y - floorCount * 100 - 50, y - floorCount * 100 - 50, y - floorCount * 100}, 4);
        while (floorCount > 0) {
            gr.setColor(c4);
            gr.fillRect(x + 20, y - floorCount * 100 + 30, 40, 40);
            gr.fillRect(x + 130, y - floorCount * 100 + 30, 40, 40);
            gr.setColor(c2);
            gr.drawLine(x + 130, y - floorCount * 100 + 50, x + 170, y - floorCount * 100 + 50);
            gr.drawLine(x + 20, y - floorCount * 100 + 50, x + 60, y - floorCount * 100 + 50);
            gr.drawLine(x + 40, y - floorCount * 100 + 30, x + 40, y - floorCount * 100 + 70);
            gr.drawLine(x + 150, y - floorCount * 100 + 30, x + 150, y - floorCount * 100 + 70);
            floorCount--;
        }
    }*/

    private int x, y, n, floorCount;
    Color c1, c2, c3, c4;

    public House(int x, int y, int floorCount, Color c1, Color c2, Color c3, Color c4) {
        this.x = x;
        this.y = y;
        this.floorCount = floorCount;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(c1);
        gr.fillRect(x, y - floorCount * 100, 190, floorCount * 100);
        if (floorCount == 1) {
            gr.setColor(new Color(0xE6E4EFEF, true));
            gr.fillOval(x + 140, y - 180, 20, 20);
            gr.fillOval(x + 120, y - 210, 40, 40);
            gr.fillOval(x + 135, y - 225, 30, 30);
            gr.setColor(c2);
            gr.fillPolygon(new int[]{x + 140, x + 160, x + 160, x + 140}, new int[]{y - 120, y - 120, y - 170, y - 170}, 4);
        }
        gr.setColor(c3);
        gr.fillRect(x + 80, y - 50, 30, 50);
        gr.fillPolygon(new int[]{x, x + 70, x + 120, x + 190}, new int[]{y - floorCount * 100, y - floorCount * 100 - 50, y - floorCount * 100 - 50, y - floorCount * 100}, 4);
        while (floorCount > 0) {
            gr.setColor(c4);
            gr.fillRect(x + 20, y - floorCount * 100 + 30, 40, 40);
            gr.fillRect(x + 130, y - floorCount * 100 + 30, 40, 40);
            gr.setColor(c2);
            gr.drawLine(x + 130, y - floorCount * 100 + 50, x + 170, y - floorCount * 100 + 50);
            gr.drawLine(x + 20, y - floorCount * 100 + 50, x + 60, y - floorCount * 100 + 50);
            gr.drawLine(x + 40, y - floorCount * 100 + 30, x + 40, y - floorCount * 100 + 70);
            gr.drawLine(x + 150, y - floorCount * 100 + 30, x + 150, y - floorCount * 100 + 70);
            floorCount--;
        }
    }
}
