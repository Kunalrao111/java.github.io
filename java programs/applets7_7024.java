import java.applet.Applet;
import java.awt.Graphics;

public class applets7_7024 extends Applet {
    public void paint(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 50;

        for (int i = 0; i < 4; i++) {
            g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
            radius += 50;
        }
    }
}