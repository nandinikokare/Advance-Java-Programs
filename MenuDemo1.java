import java.awt.*;
import java.awt.event.*;
 public class MenuDemo1 extends Frame implements ActionListener{
     MenuBar mb;
     MenuItem m1,m2,m3,m4;
     Menu mn;
     MenuShortcut ms;
     MenuDemo1(){
         setTitle("Nandini Kokare");
         setSize(400,700);
         setLayout(null);
         ms=new MenuShortcut(KeyEvent.VK_X);
         mn=new Menu("File");
         mb=new MenuBar();
         m1=new MenuItem("NEW...");
          m2=new MenuItem("Open...");
           m3=new MenuItem("Save as...");
            m4=new MenuItem("Exit",ms);o

            mn.add(m1);
            mn.add(m2);
            mn.add(m3);
            mn.addSeparator();
            mn.add(m4);
            mb.add(mn);
            m1.addActionListener(this);
            m2.addActionListener(this);
            m3.addActionListener(this);
            m4.addActionListener(this);
            mb.add(mn);
            setMenuBar(mb);
       }
       public void actionPerformed(ActionEvent e){

       }
       
           public static void main(String[] args){
               MenuDemo1 md=new MenuDemo1();
               md.setVisible(true);
           }
       
 }