import java.awt.*;
import java.awt.event.*;
class wina extends Frame implements ActionListener,ItemListener{
	Label l1,l2;
	Menu menu,submenu;
	MenuBar mb;
	MenuItem mi1,mi2,mi3,mi4,sub1,sub2;
	CheckboxMenuItem cb;
	wina(String title)
	{
		super(title);
		setLayout(new GridLayout(2,1));
		l1=new Label("   ");
		add(l1);
		l2=new Label("    ");
		add(l2);
		mb=new MenuBar();
		menu=new Menu("File");
		submenu=new Menu("SubMenu");
		mi1=new MenuItem("Item 1");
		mi2=new MenuItem("Item 2");
		mi3=new MenuItem("Item 3");
		mi4=new MenuItem("Item 4");

		cb=new CheckboxMenuItem("CBMI");
		sub1=new MenuItem("SubItem 1");
		sub2=new MenuItem("SubItem 2");
		menu.add(mi1);
		menu.addSeparator();
		menu.add(mi2);
		menu.add(mi3);
		menu.add(mi4);
		menu.add(cb);
		
		submenu.add(sub1);
		submenu.add(sub2);
		menu.add(submenu);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		cb.addItemListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		sub1.addActionListener(this);
		sub2.addActionListener(this);
		mb.add(menu);
		setMenuBar(mb);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e){
		l1.setText(((MenuItem)e.getSource()).getLabel()+" is clicked");
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(((CheckboxMenuItem)e.getItemSelectable()).getState()==true)
		{
			l1.setText(((CheckboxMenuItem)e.getItemSelectable()).getLabel()+" is clicked");

		}
	}
}
public class menuapp
{
	public static void main(String []args){
		wina wa=new wina("MenuBar App");
		wa.setSize(400,600);
		wa.setVisible(true);
	}
}