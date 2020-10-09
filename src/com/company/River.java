package com.company;

import java.awt.*;

public class River implements Drawable {
    /*public void drawRiver(Graphics2D gr, int x, int y) {
        gr.setColor(Color.BLUE);
        gr.fillArc(x, y, 50, 100, -180, 90);
        gr.fillArc(x, y + 50, 50, 100, 0, 90);
        gr.fillArc(x + 21, y + 41, 50, 100, -180, 90);
        gr.fillArc(x + 21, y + 91, 50, 100, 0, 90);
        gr.fillArc(x + 47, y + 89, 50, 100, -180, 90);
        gr.fillArc(x + 47, y + 138, 50, 100, 0, 90);
        gr.fillArc(x + 72, y + 138, 50, 100, -180, 90);
        gr.fillArc(x + 72, y + 188, 50, 100, 0, 90);
        gr.fillArc(x + 98, y + 188, 50, 100, -180, 90);
        gr.fillArc(x + 98, y + 238, 50, 100, 0, 90);
    }*/

    private int x, y;
    public River (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(Color.BLUE);
        gr.fillArc(x, y, 50, 100, -180, 90);
        gr.fillArc(x, y + 50, 50, 100, 0, 90);
        gr.fillArc(x + 21, y + 41, 50, 100, -180, 90);
        gr.fillArc(x + 21, y + 91, 50, 100, 0, 90);
        gr.fillArc(x + 47, y + 89, 50, 100, -180, 90);
        gr.fillArc(x + 47, y + 138, 50, 100, 0, 90);
        gr.fillArc(x + 72, y + 138, 50, 100, -180, 90);
        gr.fillArc(x + 72, y + 188, 50, 100, 0, 90);
        gr.fillArc(x + 98, y + 188, 50, 100, -180, 90);
        gr.fillArc(x + 98, y + 238, 50, 100, 0, 90);
    }
}
