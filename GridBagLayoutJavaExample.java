import java.awt.*; 
import java.applet.*;
 class GridBagLayoutExample extends Frame 
 { 
      GridBagLayoutExample() 
      {   
          Label lblName = new Label("Name"); 
          TextField txtName =new TextField(10); 
          Label lblcomments = new Label("Comments"); 
          TextArea TAreaComments=new TextArea(6,15); 
          Button btnSubmit = new Button("Submit"); 
          setLayout(new GridBagLayout()); 
          GridBagConstraints gc =new GridBagConstraints(); 
          add(lblName,gc,0,0,1,1,0,0); 
          add(txtName,gc,1,0,1,1,0,20); 
          add(lblcomments,gc,0,1,1,1,0,0); 
          add(TAreaComments,gc,1,1,1,1,0,60); 
          add(btnSubmit,gc,0,2,2,1,0,20); 
      } 
     void add(Component comp,GridBagConstraints gc,int x,int y,int w,int h,int wx,int wy) 
      {    
          gc.gridx = x; 
          gc.gridy = y; 
          gc.gridwidth = w; 
          gc.gridheight= h; 
          gc.weightx = wx; 
          gc.weighty = wy; 
          add(comp,gc); 
      } 
 } 
    class GridBagLayoutJavaExample 
   { 
         public static void main(String args[]) 
        { 
              GridBagLayoutExample frame = new GridBagLayoutExample(); 
              frame.setTitle("GridBagLayout in Java Example"); 
              frame.setSize(300,200); 
              frame.setVisible(true); 
        } 
   } 