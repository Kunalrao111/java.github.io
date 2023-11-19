 /*
     * prog.no 11 Java Program to change background color in applet.
     */

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class applets11_7024 extends Applet {
   
    public applets11_7024() {
        setBackground(Color.red);
    }

    public void paint(java.awt.Graphics g) {

        g.drawString("Background Color Changed", 50, 50);
    }
    /*
     * <applet code="applets11_7024.class" width="300" height="300">
     * </applet>
     */
}