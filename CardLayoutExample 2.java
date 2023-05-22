import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CardLayoutExample extends JFrame implements ActionListener{
	CardLayout card;
	JButton b1,b2,b3;
	Container con;
	CardLayoutExample()
	{
		con=getContentPane();
		card=new CardLayout(40,30);
		con.setLayout(card);
		b1=new JButton("Apple");
		b2=new JButton("Boy");
		b3=new JButton("Cat");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		con.add("a",b1);
		con.add("b",b2);
		con.add("c",b3);
	}
	public void actionPerformed(ActionEvent e){
		card.next(con);

	}
	public static void main(String[] args){
		CardLayoutExample con=new CardLayoutExample();
		con.setSize(400,400);
		con.setVisible(true);
		con.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}