import java.awt.*;
import java.awt.event.*;
public class WindowDemo {
    Frame f;
    WindowDemo(){
        f=new Frame("WindOW Adapter");
        f.addWindowListener(new WindowAdapter()
        {
            public void WindowClosing(WindowEvent e){
                f.dispose();

            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(false);
    }
    public static void main(String[]args){
        new WindowDemo();
    }
}