import java.awt.*;
import java.awt.event.*;
 public class  SimpleAwtGui {
     private static final int button_count = 10;
     Frame frame;
    Button [] button = new Button[button_count];
  public SimpleAwtGui() {
         frame = new Frame("Nandini Kokare");
          for(int i = 0; i < button_count; ++i){
            button[i] = new Button("Button: " + i );
        }
    }
   public static void main(String[] args) {
        SimpleAwtGui window = new SimpleAwtGui();
        window.showFrame();
 }
    public void showFrame() {
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        for(int i = 0; i < button_count; ++i) {
            frame.add(button[i]);
        }
        frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
        frame.setVisible(true);
    }
}

