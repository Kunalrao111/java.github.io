import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class applets14_7024 extends Applet implements Runnable {
    private Thread thread;
    private SimpleDateFormat dateFormat;

    public void init() {
        dateFormat = new SimpleDateFormat("HH:mm:ss");
        thread = new Thread(this);
        thread.start();
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(dateFormat.format(new Date()), 50, 50);
    }
}