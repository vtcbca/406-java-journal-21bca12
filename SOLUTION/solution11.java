import java.awt.*;
import java.applet.*;

//<applet code="appleteg.class" height="800" width="1860"> </applet>

public class appleteg extends Applet {
	
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(300,300,450,450);

        g.setColor(Color.yellow);
        Font font = new Font("Times New Roman", Font.PLAIN, 50);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        int x = (200 - metrics.stringWidth("My College")) / 2;
        int y = ((200 - metrics.getHeight()) / 2) + metrics.getAscent();
        g.drawString("HELLO Applet", 300+x, 300+y);
		
    }