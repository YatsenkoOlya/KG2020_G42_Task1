package com.company;

import java.awt.*;

public class Cloud implements Drawable {
    /*public void drawCloud(Graphics2D gr, int x, int y) {
        gr.setColor(Color.WHITE);
        for (int i = x; i <= x+40; i += 20)
            gr.fillOval(i, y, 40, 40);
        gr.fillOval(x+10, y-15, 30, 30);
        gr.fillOval(x+30, y-15, 40, 40);
    }*/

    private int x, y;
    public Cloud (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(Color.WHITE);
        for (int i = x; i <= x+40; i += 20)
            gr.fillOval(i, y, 40, 40);
        gr.fillOval(x+10, y-15, 30, 30);
        gr.fillOval(x+30, y-15, 40, 40);
    }
}
