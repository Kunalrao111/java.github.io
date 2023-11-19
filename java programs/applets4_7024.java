import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Polygon;

public class applets4_7024 extends Applet {
    public void paint(Graphics g) {
        int[] xPoints = {50, 150, 250, 200, 100};
        int[] yPoints = {200, 100, 200, 300, 300};
        int numPoints = xPoints.length;

        Polygon polygon = new Polygon(xPoints, yPoints, numPoints);
        g.drawPolygon(polygon);
    }
}