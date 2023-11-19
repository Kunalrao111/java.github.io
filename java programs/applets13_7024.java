import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class applets13_7024 extends Applet {
    public void paint(Graphics g) {
        Font font = new Font("Arial", Font.BOLD, 24);
        g.setFont(font);

        g.drawString("Custom Font", 50, 50);
    }
}