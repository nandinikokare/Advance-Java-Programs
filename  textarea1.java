import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class textarea1 extends Applet implements ActionListener{
	TextArea ta;
	Button b1;
	
	public void init()
	{   
		ta=new TextArea("hi hello",5,20,TextArea.SCROLLBARS_BOTH);
		add(ta);
		b1=new Button("Replace Selected String");
		add(b1);
		b1.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e)
	{
		int start=ta.getSelectionStart();
		int end=ta.getSelectionEnd();
		ta.replaceRange("hi,start,end");

	}
}