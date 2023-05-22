import java.awt.*;
import java.awt.event.*;
class wina extends Frame implements ActionListener
{
	Label l1;
	Menu menu1,menu2;
	MenuBar mb;
	MenuItem mi1,mi2,mi3,mi4;
	wina(String title)
	{
		super(title);
		setLayout(new GridLayout(2,1));
		L1=new Label("                 ");
		add(L1);
		mb=new MenuBar();
		menu1= new Menu("File");
		menu2=new Menu("Edit");
		mi1=new MenuItem("New");
		mi2=new MenuItem("Open");
		mi3=new MenuItem("Copy");
		mi4=new MenuItem("Paste");
		menu1.add(mi1);
		menu1.addSeparator();
		menu1.add(mmi2);
		menu3.add(mmi3);
		menu4.add(mmi4);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		mb.add(menu1);
		mb.add(menu2);
		setMenuBar(mb);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});

	}
	public void actionPerformed(ActionEvent e){
		L1.setText(((MenuItem)e.getSource()).getLabel()+" MenuItem is clicked");
	}
	public class menuappSimple{
		public static void main(String [] args){
			wina wa=new wina("MenuBar App");
			wa.setSize(400,600);
			wa.setVisible(true);
		}
	}
}