import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Gridbutton extends Applet implements ActionListener{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Label L1;
	         public void init()
	         {  setLayout(new GridLayout(5,5));
	         	b1=new Button("Button1");
	         	b2=new Button("Button2");
				 b3=new Button("Button3");
				 b4=new Button("Button4");
				 b5=new Button("Button5");
				 b6=new Button("Button6");
				 b7=new Button("Button7");
				 b8=new Button("Button8");
				 b9=new Button("Button9");
				 b10=new Button("Button10");
	         	L1=new Label("                                 ");
	         	add(b1);
	         	add(b2);
				 add(b3);
				 add(b4);
				 add(b5);
				 add(b6);
				 add(b7);
				 add(b8);
				 add(b9);
				 add(b10);
	         	add(L1);
	         	b1.setActionCommand("Button1 ActionCommand");
	         	b2.setActionCommand("Button2 ActionCommand");
				b3.setActionCommand("Button3 ActionCommand");
				b4.setActionCommand("Button4 ActionCommand");
				b5.setActionCommand("Button5 ActionCommand");
				b6.setActionCommand("Button5 ActionCommand");
				b7.setActionCommand("Button5 ActionCommand");
				b8.setActionCommand("Button5 ActionCommand");
				b9.setActionCommand("Button5 ActionCommand");
				b10.setActionCommand("Button5 ActionCommand");
                b1.addActionListener(this);
                b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				b5.addActionListener(this);
				b6.addActionListener(this);
				b7.addActionListener(this);
				b8.addActionListener(this);
				b9.addActionListener(this);
				b10.addActionListener(this);

             }
             public void actionPerformed(ActionEvent ae){
             	if(ae.getActionCommand()=="OK ActionCommand"){
             		L1.setText(b1.getLabel()+"is clicked");
             	}
             	else if(ae.getActionCommand()=="RESET ActionCommand"){
             		L1.setText(b2.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button3 ActionCommand"){
             		L1.setText(b3.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button4 ActionCommand"){
             		L1.setText(b4.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button5 ActionCommand"){
             		L1.setText(b5.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button6 ActionCommand"){
             		L1.setText(b6.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button7 ActionCommand"){
             		L1.setText(b7.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button8 ActionCommand"){
             		L1.setText(b8.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button9 ActionCommand"){
             		L1.setText(b9.getLabel()+"is clicked");
             	}
				 else if(ae.getActionCommand()=="Button10 ActionCommand"){
             		L1.setText(b10.getLabel()+"is clicked");
             	}
             }

	
}