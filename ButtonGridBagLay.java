import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ButtonGridBagLay extends Applet implements ActionListener{
Button b1,b2,b3,b4,b5;
	Label L1;
	         public void init()
	         {  
	         	GridBagLayout gb=new GridBagLayout();
	         	GridBagConstraints gs=new GridBagConstraints();
	         	setLayout(gb);
	         	gs.weighty=0;
	         	gs.fill=GridBagConstraints.BOTH;
	            gs.weightx=0;
	         	b1=new Button("Button1");
                gb.setConstraints(b1,gs);
                gs.weighty=0;
	         	b2=new Button("Button2");
				gb.setConstraints(b2,gs);
				gs.gridwidth=GridBagConstraints.HORIZONTAL;

				b3=new Button("Button3");
                gb.setConstraints(b3,gs);
                

                b4=new Button("Button4");
                gb.setConstraints(b4,gs);
                

                b5=new Button("Button5");
                gb.setConstraints(b5,gs);
               
	         	L1=new Label("                                 ");
	         	add(b1);
	         	add(b2);
	         	add(b3);
	         	add(b4);
	         	add(b5);
	         	
	         	add(L1);
	         	b1.setActionCommand("Button1 ActionCommand");
	         	b2.setActionCommand("Button2 ActionCommand");
	         	b3.setActionCommand("Button3 ActionCommand");
	         	b4.setActionCommand("Button4 ActionCommand");
	         	b5.setActionCommand("Button5 ActionCommand");
	         	b1.addActionListener(this);
                b2.addActionListener(this);
                b3.addActionListener(this);
                b4.addActionListener(this);
                b5.addActionListener(this);
                
				

             }
             public void actionPerformed(ActionEvent ae){
             	if(ae.getActionCommand()=="Button1 ActionCommand"){
             		L1.setText(b1.getLabel()+"is clicked");
             	}
             	else if(ae.getActionCommand()=="Button2 ActionCommand"){
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
				
             }

	
}