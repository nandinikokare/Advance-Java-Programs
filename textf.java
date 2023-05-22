import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class textf extends Applet implements ActionListener{
	TextField t1,t2,t3,t4;
	Label L1,L2,L3,L4;
	public void init(){
		L1=new Label("First Name");
		t1=new TextField(20);
		add(L1);
		add(t1); 
		t1.addActionListener(this);
		L2=new Label("Last Name");
		t2=new TextField(20);
		add(L2);
		add(t2);
		L3=new Label("Email");
		t3=new TextField(20);
		add(L3);
		add(t3);
		t3.addActionListener(this);
		L4=new Label("Password");
		t4=new TextField(20);
		t4.setEchoChar('.');
		add(L4);
		add(t4);
} 
public void actionPerformed(ActionEvent e){
	if(e.getSource()==t1){
		t2.setText(t1.getText());

	}
	else if(e.getSource()==t3){
		t4.setText(t3.getText());
			}
}
}