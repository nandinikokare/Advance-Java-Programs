import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class xormode extends Applet
{
	public void paint(Graphics g){
	g.setColor(Color.green);
	g.fillRect(40,40,300,300);
	g.setXORMode(Color.yellow);
	g.drawLine(10,10,400,200);
	}
}