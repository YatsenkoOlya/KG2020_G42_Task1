package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {

    ///////////////////////////

    private ArrayList<Grass> grass;
    public DrawPanel() {
        Random r = new Random();
        grass = new ArrayList<>();
        for (int i = 0; i <= 90; i++) {
            grass.add(new Grass(r.nextInt(700), 352 + (int)(Math.random() * (600 - 352) + 1)));
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.setColor(Color.GREEN);
        gr.fillRect( 0, 325, 700, 600); // земля
        gr.setColor(new Color(0x6AD4EC));
        gr.fillRect(0, 0, 700, 325); // небо

        // трава:
        for (Grass grass : grass) {
            grass.draw(gr);
        }
        /*Random r = new Random();
        for (int i = 0; i <= 90; i++) {
            Grass grass = new Grass(r.nextInt(getWidth()), 352 + (int)(Math.random() * (600 - 352) + 1));
            grass.draw(gr);
        }*/
        /*for (int i = 352; i < 652; i += 20) {
            Grass grass = new Grass(-9, i, 145);
            grass.draw(gr);
        }*/

        // дом1:
        House house1 = new House(25, 370, 1, new Color(0xBD5713), new Color(0xBD5713),
                new Color(0x8E0F29), new Color(0x2EBB7D));
        house1.draw(gr);
        gr.setColor(new Color(0x8E0F29));
        gr.drawString("Welcome", 95, 315);

        // облака:
        Cloud cloud = new Cloud(70, 70);
        cloud.draw(gr);
        Cloud cloud1 = new Cloud(250, 110);
        cloud1.draw(gr);

        // Солнце:
        Sun sun = new Sun(550, 90, 30, 60, 40, Color.YELLOW);
        sun.draw(gr);

        // река:
        River river = new River(335, 275);
        river.draw(gr);

        // дом2:
        House house2 = new House(190, 535, 1, new Color(0x8E0F29), new Color(0x8E0F29),
                new Color(0xBD5713), new Color(0x2EBB7D));
        house2.draw(gr);

        // велосипед:
        Bike bike = new Bike(-100, 510);
        bike.draw(gr);

        // деревья:
        Tree tree1 = new Tree(500, 375, 1);
        tree1.draw(gr); // дерево1
        Tree tree3 = new Tree(620, 350, 1);
        tree3.draw(gr); // дерево3
        Tree tree2 = new Tree(570, 525, 2);
        tree2.draw(gr); // дерево2
        Tree tree4 = new Tree(45, 555, 2);
        tree4.draw(gr); // дерево4

        // ёлки:
        Tree tree5 = new Tree(395, 400, 3);
        tree5.draw(gr);
        Tree tree6 = new Tree(225, 350, 3);
        tree6.draw(gr);
        Tree tree7 = new Tree(465, 535, 3);
        tree7.draw(gr);

        // самолёт:
        Aircraft air = new Aircraft(370, 220);
        air.draw(gr);
    }
}
