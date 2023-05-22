import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class card_p extends Panel
{
	Button b1;
	Label l1;
	card_p(Samplecard c,String no);
	{
		l1=new Label("this is card no: "+no);
		add(l1);
		b1=new Button("Next");
		add(b1);
		b1.addActionListener(c);
	}
	public class Samplecard extends Applet implements ActionListener
	{
		card_p p1,p2,p3;
		int index=1;
		CardLayout cl;
		public void init()
		{
			cl=new CardLayout();
			setLayout(cl);

			p1=new card_p(this,"one");
			add("first",p1);
			p2=new card_p(this,"two");
			add("second",p2);
			p3=new card_p(this,"three");
			add("third",p3);
			cl.show(this,"first");
		}
		public void actionPerformed(ActionEvent e)
		{
			switch(++index)
			{
				case 1:
				cl.show(this,"first");
				break;
				case 2:
				cl.show(this,"second");
				break;
				case 3:
				cl.show(this,"third");
				break;
			}
			if(index==3){
				index=0;
			}
		}
	}
}