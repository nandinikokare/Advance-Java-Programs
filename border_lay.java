import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class border_lay extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	TextField t5;
	public void init()
	{
		setLayout(new BorderLayout());
		b1=new Button("Button 1");
		add("North",b1);
		b1.addActionListener(this);
		b2=new Button("Button 2");
		add("South",b2);
		b2.addActionListener(this);
		b3=new Button("Button 3");
		add("East",b3);
		b3.addActionListener(this);
		b4=new Button("Button 4");
		add("West",b4);
		b4.addActionListener(this);
		t5=new TextField("");
		add("Center",t5);
	}
		public void actionPerformed(ActionEvent e)
	{
		t5.setText(((Button)e.getSource()).getLabel()+" is clicked");
	
			}
}