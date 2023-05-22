import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class list2 extends Applet implements ActionListener{
	TextField t1;
	List l1;
	String abc[];
	public void init(){
	t1=new TextField(30);
	add(t1);
	l1=new List(10);
	for(int i=0;i<10;i++)
	{
	l1.add("item");
	l1.add("abc");
	}
	l1.makeVisible(2);
	l1.select(2);
	add(l1);
	l1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
    if(e.getSource()==l1)
    {
    t1.setText(((List)e.getSource()).getSelectedItem());
    abc=l1.getItems();
    System.out.println("List Element="+abc[0]);
    }
	}
}