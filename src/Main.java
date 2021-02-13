
import java.awt.Color;
import javax.swing.JFrame;

/*

 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame ();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setTitle("Cesba Ventana");
        
        frame.setResizable(true);
       
        //frame.getContentPane().setBackground(Color.pink);
        frame.getContentPane().setBackground(new Color(181, 51, 255));
    
}
}