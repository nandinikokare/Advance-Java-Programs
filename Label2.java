import java.applet.*;
import java.awt.*;
class Label2{
	public static void main(String[] args){
		Frame f=new Frame("Nandini");
		Label l1;
		l1=new Label("Welcome to java");
		l1.setBounds(50,100,100,30);
		f.add(l1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
}
	