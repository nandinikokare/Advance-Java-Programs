import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class cities extends Applet{
	public void init(){
		List l1=new List(10);
		l1.setBounds(50,60,100,120);
		l1.add("Baramati");
		l1.add("Mumbai");
		l1.add("Pune");
		l1.add("Delhi");
		l1.add("Nashik");
		l1.add("Someshwarnagar");
		l1.add("Chennai");
		l1.add("Bhopal");
		l1.add("Banglore");
		add(l1);
		setLayout(null);

	}
	public void paint(Graphics g){
		repaint();
	}
}