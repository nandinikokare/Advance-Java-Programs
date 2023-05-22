import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Button1 extends Applet implements ActionListener{
Button b1,b2,b3;
	Label L1;
	         public void init()
	         {  
	         	b1=new Button("OK");
	         	b2=new Button("RESET");
				 b3=new Button("CANCEL");
				
				
	         	L1=new Label("                                 ");
	         	add(b1);
	         	add(b2);
				 add(b3);
	         	add(L1);
	         	b1.setActionCommand("Button1 ActionCommand");
	         	b2.setActionCommand("Button2 ActionCommand");
				 b3.setActionCommand("Button2 ActionCommand");
				
                b1.addActionListener(this);
                b2.addActionListener(this);
				 b3.addActionListener(this);
				

             }
             public void actionPerformed(ActionEvent ae){
             	if(ae.getActionCommand()=="OK ActionCommand"){
             		L1.setText(b1.getLabel()+"is clicked");
             	}
             	else if(ae.getActionCommand()=="RESET ActionCommand"){
             		L1.setText(b2.getLabel()+"is clicked");
             	}
				else if(ae.getActionCommand()=="CANCLE ActionCommand"){
             		L1.setText(b3.getLabel()+"is clicked");
             	}
				
             }

	
}
