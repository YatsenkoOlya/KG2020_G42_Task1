package com.company;

import java.awt.*;

public class Aircraft implements Drawable {
    /*public void drawAircraft(Graphics2D gr, int x, int y) {
        gr.setColor(new Color(0x1E61C2));
        gr.fillPolygon(new int[] {x, x, x + 80, x + 80}, new int[] {y, y - 20, y - 28, y + 8}, 4); // корпус
        gr.fillPolygon(new int[] {x - 5, x - 25, x - 5, x + 15}, new int[] {y - 1, y - 45, y - 45, y}, 4); // хвост
        gr.setColor(new Color(0x184C97));
        gr.fillPolygon(new int[] {x + 18, x + 3, x + 25, x + 40}, new int[] {y - 21, y - 35, y - 35, y - 22}, 4); // верх крыло
        gr.fillPolygon(new int[] {x - 5, x + 23, x + 53, x + 20}, new int[] {y + 22, y - 2, y - 2, y + 22}, 4); // нижн крыло
        gr.setColor(new Color(0xE46192D9, true));
        gr.fillOval(x + 37, y - 32, 35, 20); // окно
        gr.fillOval(x + 79, y - 15, 11, 11);
        gr.fillOval(x + 82, y - 39, 6, 26);
        gr.fillOval(x + 82, y - 6, 6, 26);
    }*/

    private int x, y;
    public Aircraft (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) {
        gr.setColor(new Color(0x1E61C2));
        gr.fillPolygon(new int[] {x, x, x + 80, x + 80}, new int[] {y, y - 20, y - 28, y + 8}, 4); // корпус
        gr.fillPolygon(new int[] {x - 5, x - 25, x - 5, x + 15}, new int[] {y - 1, y - 45, y - 45, y}, 4); // хвост
        gr.setColor(new Color(0x184C97));
        gr.fillPolygon(new int[] {x + 18, x + 3, x + 25, x + 40}, new int[] {y - 21, y - 35, y - 35, y - 22}, 4); // верх крыло
        gr.fillPolygon(new int[] {x - 5, x + 23, x + 53, x + 20}, new int[] {y + 22, y - 2, y - 2, y + 22}, 4); // нижн крыло
        gr.setColor(new Color(0xE46192D9, true));
        gr.fillOval(x + 37, y - 32, 35, 20); // окно
        gr.fillOval(x + 79, y - 15, 11, 11);
        gr.fillOval(x + 82, y - 39, 6, 26);
        gr.fillOval(x + 82, y - 6, 6, 26);
    }
}
