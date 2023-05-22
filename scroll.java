import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class scroll extends Applet implements AdjustmentListener{
	
	TextField t1;
	Scrollbar sv,sh;
	             public void init(){
	             	t1=new TextField(70);
	             	add(t1);
	             	sv=new Scrollbar(1,1,2,1,200);
	             	sh=new Scrollbar(Scrollbar.HORIZONTAL,1,2,1,200);
	             	sv.setUnitIncrement(5);
	             	add(sv);
	             	add(sh);
	             	sh.addAdjustmentListener(this);
	             	sv.addAdjustmentListener(this);

	             }
	             public void adjustmentValueChanged(AdjustmentEvent e){
	             	if(e.getAdjustable()==sv || e.getAdjustable()==sh);
	             	{
	             		t1.setText("Horizontal Scrollbar value="+sh.getValue()+"Vertical scrollbar value="+sv.getValue());
	             	}
	             }

}