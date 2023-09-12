import javax.swing.JOptionPane;

public class OneToTen   {
    public static void main (String... args)    {
        int num = 0;
        while   (num < 10)  {
            num += 1;
            JOptionPane.showMessageDialog(null, "O número é: " + num);
        }
    }
}