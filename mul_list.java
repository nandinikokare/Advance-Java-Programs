import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mul_list extends Applet implements ActionListener{
	TextField t1;
	List l1;
	Button b1;
	public void init()
	{
		t1=new TextField(40);
		add(t1);
		b1=new Button("Selected Items");
		add(b1);
		b1.addActionListener(this);
		l1=new List(3,true);
		l1.add("lokmat");
		l1.add("Sakal");
		l1.add("Pudhari");
		l1.add("Hindustan times");
		l1.add("Loksatta");
		add(l1);

	}
	public void actionPerformed(ActionEvent e){
		String sel[];
		String out=" ";
		if(e.getSource()==b1)
		{
			sel=l1.getSelectedItems();
			for(int i=0;i<sel.length;i++)
			{
				out=out+sel[i]+" ";
			}
t1.setText(out+"are selected");
		}
	}
}