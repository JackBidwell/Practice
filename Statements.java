import javax.swing.JOptionPane;

public class Statements {
    
    public static void main(String[] args){

    int x = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));

    if(x>=75){
        JOptionPane.showMessageDialog(null, "You are very old");
    }
    else if(x>=18){
        JOptionPane.showMessageDialog(null, "Cool who cares this is practice");
    }
    else if(x>=13){
        JOptionPane.showMessageDialog(null, "Cool who cares again");
    }

    }

}
