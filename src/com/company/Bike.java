package com.company;

import java.awt.*;

public class Bike implements Drawable {
    /*public void drawBike(Graphics2D gr, int x, int y) {
        drawWheel(gr, x + 210, y, 15, 4, 14, Color.BLACK);
        drawWheel(gr, x + 265, y, 15, 4, 14, Color.BLACK);

        gr.setColor(Color.BLACK);
        gr.drawLine( x + 237, y, x + 265, y); // нижн
        gr.drawLine(x + 220, y - 20, x + 237, y); // левая
        gr.drawLine(x + 220, y - 20, x + 248, y - 20); // верх
        gr.drawLine(x + 248, y - 20,x + 265, y); // прав

        gr.drawLine(x + 210, y, x + 226, y - 32); // перед
        gr.drawLine(x + 226, y - 32, x + 232, y - 32); // руль
        gr.drawLine(x + 240, y + 8, x + 250, y - 25); // задн
        gr.drawLine(x + 240, y - 25, x + 252, y - 25); // сиденье
        gr.drawLine(x + 235, y + 8, x + 240, y + 8); // педали
    }

    public void drawWheel(Graphics2D gr, int x, int y, int r, int R, int n, Color c) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(2.0f));
        gr.drawOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            gr.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
        }
    }*/

    private int x, y;
    public Bike (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) {
        drawWheel(gr, x + 210, y, 15, 4, 14, Color.BLACK);
        drawWheel(gr, x + 265, y, 15, 4, 14, Color.BLACK);

        gr.setColor(Color.BLACK);
        gr.drawLine( x + 237, y, x + 265, y); // нижн
        gr.drawLine(x + 220, y - 20, x + 237, y); // левая
        gr.drawLine(x + 220, y - 20, x + 248, y - 20); // верх
        gr.drawLine(x + 248, y - 20,x + 265, y); // прав

        gr.drawLine(x + 210, y, x + 226, y - 32); // перед
        gr.drawLine(x + 226, y - 32, x + 232, y - 32); // руль
        gr.drawLine(x + 240, y + 8, x + 250, y - 25); // задн
        gr.drawLine(x + 240, y - 25, x + 252, y - 25); // сиденье
        gr.drawLine(x + 235, y + 8, x + 240, y + 8); // педали
    }
    public void drawWheel(Graphics2D gr, int x, int y, int r, int R, int n, Color c) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(2.0f));
        gr.drawOval(x - r, y - r, r + r, r + r);
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
