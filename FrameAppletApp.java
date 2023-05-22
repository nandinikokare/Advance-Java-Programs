import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class FrameAppletApp extends Applet implements ActionListener
{
	frame1 ff;
	Button b1,b2;
	public void init()
	{
	b1=new Button("VisibleFrame");
	b2=new Button("HideFrame");
	ff=new frame1("frame app");
	ff.setSize(600,200);
	add(b1);
	add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
	}

public void ActionPerformed(ActionEvent ae){
	if(ae.getSource()==b1)
	{
	ff.setVisible(true);
	}
	else if(ae.getSource()==b2)
	{
	ff.setVisible(false);
	}
}
}
