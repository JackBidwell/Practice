
import javax.swing.JOptionPane;


public class Pythogrean {
    public static void main(String[] args){

        double z;
        

        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter Side One"));

        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter Side two"));

        

        z = Math.sqrt((x*x)+(y*y));

        JOptionPane.showMessageDialog(null, "Side three is equal to "+z);

    }
}
