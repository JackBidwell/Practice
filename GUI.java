import javax.swing.JOptionPane;

class GUI {
    public static void main(String[] args){

        String name = JOptionPane.showInputDialog("Enter Your Name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+" years old");

    }
}