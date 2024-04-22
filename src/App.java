import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        do {
            int range = Integer.parseInt(JOptionPane.showInputDialog("Please enter a range"));
            double number;
            boolean playAgain = true;

            do {
                number = Math.ceil(Math.random() * range);
                System.out.println("Number: " + number);
    
                do {
                    String guessSTR = JOptionPane.showInputDialog("Enter a guess from 1 - " + range + ":");
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
    
            } while (false);

            int playAgainPrompt = JOptionPane.showConfirmDialog(null, "Do you want to continue playing?", "Play again?", JOptionPane.YES_NO_OPTION);
    
            if (playAgainPrompt == 0) {
                continue;
            } else {
                break;
            }

        } while (true);
        
    }
}
