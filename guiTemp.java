import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class guiTemp extends JPanel {
   
   public void paint(Graphics g) {
      g.setColor(Color.RED);
      g.fillRect (5, 5, 50, 100);
      g.setColor(Color.YELLOW);
      g.fillRect (59, 5, 50, 100);
   }
   
   public static void main(String[] a) {
      JFrame f = new JFrame();
      f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
         }
         );
      f.setContentPane(new guiTemp());
      f.setSize(400,400);
      f.setVisible(true);
   }
}