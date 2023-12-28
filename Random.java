import java.util.random;
import javax.swing.JOptionPane;

public interface Random {
    
    public static void main(String[] args){

        Random random = new Random();
        boolean z = random.nextBoolean();

        JOptionPane.showMessageDialog(null, z);
        };

    }
}
