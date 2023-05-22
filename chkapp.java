import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class chkapp extends Applet implements ItemListener{
	Checkbox c1,c2,c3;
	Label hobby;
	String msg="";
	public void init(){
		c1=new Checkbox("playing",false);
		add(c1);
		c1.addItemListener(this);
		c2=new Checkbox("music",false);
		add(c2);
		c2.addItemListener(this);
		c3=new Checkbox("surfing",false);
		add(c3);
		c3.addItemListener(this);
		hobby=new Label("                                                               ");
		add(hobby);

			}
			public void itemStateChanged(ItemEvent e){
				if(((Checkbox)e.getItemSelectable()).getState()==true)  
				//ItemSelectable getItemSelectable().destv=(dest dt)source;
				{
					msg=msg+(" "+((Checkbox)e.getItemSelectable()).getLabel());
				} 
				else if(((Checkbox)e.getItemSelectable()).getState()==false)
				 {
					hobby.setVisible(false);
				}
				
			
				hobby.setText(msg);
			}
}