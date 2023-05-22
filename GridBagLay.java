import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class GridBagLay extends Applet
{
	TextField t1,t2,t3,t4,t5,t6,t7;
	public void init(){
		GridBagLayout gb=new GridBagLayout();
		GridBagConstraints gs=new GridBagConstraints();
		setLayout(gb);
		gs.weighty=1;
		gs.fill=GridBagConstraints.BOTH;
		gs.weightx=1;
		t1=new TextField("TF1",5);
		gb.setConstraints(t1,gs);
		add(t1);
		gs.weightx=2;
		t2=new TextField("TF2",5);
		gb.setConstraints(t2,gs);
		add(t2);
		gs.gridwidth=GridBagConstraints.REMAINDER;
		t3=new TextField("TF3",5);
		gb.setConstraints(t3,gs);
		add(t3);
		gs.gridwidth=GridBagConstraints.REMAINDER;
		t4=new TextField("TF4",5);
		gb.setConstraints(t4,gs);
		add(t4);
		gs.gridwidth=1;
		t5=new TextField("TF5",5);
		gb.setConstraints(t5,gs);
		add(t5);
		gs.gridwidth=GridBagConstraints.REMAINDER;
		t6=new TextField("TF6",5);
		gb.setConstraints(t6,gs);
		add(t6);
		gs.gridwidth=GridBagConstraints.REMAINDER;
		t7=new TextField("TF7",5);
		gb.setConstraints(t7,gs);
		add(t7);
	}
}