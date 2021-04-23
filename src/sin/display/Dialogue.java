package sin.display;

import sin.Game;
import sin.lib.Lib;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Dialogue {

    public boolean dialogue;
    public Game game;
    public BufferedImage box;


    public Dialogue(Game game) {
        this.game = game;
        box = Lib.getImage("src/resources/display/textBox.png");
        dialogue = false;

    }

    public void render(Graphics g) {
        if(dialogue) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.scale(2, 2);
            g.drawImage(box, 0, 0, null);
            g2d.scale(.5, .5);
            Font currentFont = g.getFont();
            Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
            g.setFont(newFont);
            g.setColor(Color.WHITE);

            g.drawString("This ia test string that probably looks dogshit!", 36, 180);
        }
    }

    public void tick() {

    }

}
