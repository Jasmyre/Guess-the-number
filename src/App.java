import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        int range = 100;
        double number = Math.ceil(Math.random() * range);
        boolean playAgain = true;
        
        System.out.println("Number: " + number);

        do {
            String guessSTR = JOptionPane.showInputDialog("Enter a guess from 1 - 100:");
            if (guessSTR == null) {
                break;
            }

            if (guessSTR.length() > 0) {
                int guess = Integer.parseInt(guessSTR);

                try {
                    if (guess > number) {
                        JOptionPane.showMessageDialog(null, "The guess is higher than the number.");
                    } else if (guess < number) {
                        JOptionPane.showMessageDialog(null, "The guess is lower than the number.");
                    } else if (number == guess) {
                        JOptionPane.showMessageDialog(null, "You guessed the NUMBER!!");
                        
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Input");
                    }
                } catch (Exception e) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number!");
                }
            }

            
        } while (playAgain);
    }
}
