import java.awt.*;
 import java.awt.event.*;
class wapp extends Frame 
{
Label lb; wapp(String title) {
super(title);
lb=new Label("Hiii This is Windows Application"); add(lb);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0); }
}); }
}
public class winapp {
public static void main(String [] args) {
wapp wa=new wapp("Nandini Kokare.");
wa.setSize(300,300);
wa.setVisible(true); }
}
