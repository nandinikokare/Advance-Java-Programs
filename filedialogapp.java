import java.awt.*;
import java.awt.event.*;
class wina extends Frame implements ActionListener{
    Button b1;
    FileDialog fd;
    Label l1;
    public wina(String title){
        super(title);
        setLayout(new GridLayout(2,1));
        fd=new FileDialog(this,"Save File Dialog App",FileDialog.SAVE);
        l1=new Label("             ");
        add(l1);
        b1=new Button("Visible");
        add(b1);
        b1.addActionListener(this);
        addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0); } });
    } 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1)
        {
            fd.setVisible(true);
            l1.setText("Selected File: "+fd.getFile()+" "+"Selected Directory="+fd.getDirectory());
        }
    }
}
public class filedialogapp
 {
    public static void main(String [] args)
    {
        wina wa=new wina("FileDialog App");
        wa.setSize(600,300);
        wa.setVisible(true);
    }
}