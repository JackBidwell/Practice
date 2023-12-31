import javax.swing.JOptionPane;
import java.util.ArrayList;


public class ReplacingVariablesDsiplayWIndow {

    public static void main(String[] args){

        String[][] cars = new String[3][3];

        cars[0][0] = "camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "BMW";
        cars[1][1] = "Hyundai";
        cars[1][2] = "F 150";
        cars[2][0] = "Lamborghini";
        cars[2][1] = "Tesla";
        cars[2][2] = "Mustang";

        JOptionPane.showMessageDialog(null, cars); 
        
        int whatoreplace = Integer.parseInt(JOptionPane.showInputDialog("What cars would you like to change?"));
        
        int replacements = Integer.parseInt(JOptionPane.showInputDialog("What would you like to replace them with?"));

    }
    
}
