package com.company;

import java.awt.*;

public class Sun implements Drawable {
    /*public void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
        }
    }*/

    private int x, y, r, R, n; Color c;
    public Sun (int x, int y, int r, int R, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.R = R;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(c);
        gr.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            gr.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
        }
    }
}
