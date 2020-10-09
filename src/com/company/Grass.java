package com.company;

import java.awt.*;

public class Grass implements Drawable {
   /* public void drawGrass(Graphics2D gr, int x, int y, int n) {
        gr.setColor(new Color(0x56A80C));
        Random r = new Random();
        r.nextInt();
        for (int i = 0; i < n; i++) {
            gr.drawLine(x, y, x + 20, y - 30);
            x += 5;
        }
    }*/

    private int x, y;
    public Grass (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(0x56A80C));
        gr.drawLine(x, y, x - 15, y - 10);
        gr.drawLine(x, y, x - 8, y - 13);
        gr.drawLine(x, y, x - 1, y - 13);
        gr.drawLine(x, y, x + 6, y - 13);
        gr.drawLine(x, y, x + 13, y - 10);
        /*for (int i = 0; i < n; i++) {
            gr.drawLine(x, y, x + 20, y - 30);
            x += 5;
        }*/
    }
}
