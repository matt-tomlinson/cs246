import java.awt.EventQueue;
import javax.swing.JFrame;


public class Snake extends JFrame {

    public Snake() {

        add(new Board());        
        
        setTitle("Snake");
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {                
                JFrame ex = new Snake();
                ex.setVisible(true);                
            }
        });
    }
}