import java.awt.*;
import java.awt.event.*;
class frameapp extends Frame implements ActionListener
{
	Label l1;
	Button b1;
	public frameapp(String title)
	{
		super(title);
		//setLayout(new GridLayout(1,2));
		l1=new Label("                                         ");
		add(l1);
		b1=new Button("Click me");
		add(b1);
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource()==b1)
			{
				l1.setText("Button is clicked");
			}
		}
		public static void main(String[] args)
		{
			frameapp ff=new frameapp("Frame App");
			ff.setSize(300,300);
			ff.setVisible(true);
		
		}
		
	} 
