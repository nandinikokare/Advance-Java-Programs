import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class RadioApp extends Applet implements ItemListener
{
    Label l1;
	Checkbox c1,c2,c3;
	CheckboxGroup cb;
	public void init()
	{
		cb=new CheckboxGroup();
		c1=new Checkbox("CO ",false,cb);
		add(c1);
		c1.addItemListener(this);
		c2=new Checkbox("ME ",false,cb);
		add(c2);
		c2.addItemListener(this);
		c3=new Checkbox("EE ",false,cb);
		add(c3);
		c3.addItemListener(this);

        l1=new Label("                                                ");
        add(l1);

	}
	public void itemStateChanged(ItemEvent e){
		l1.setText(((Checkbox)e.getItemSelectable()).getLabel()+"branch is selected");
	}
}