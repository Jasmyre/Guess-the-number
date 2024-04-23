import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

public class App {
    public static void main(String[] args) {

        do {
            UIManager.put("OptionPane.minimumSize",new Dimension(500,350)); 

            JLabel rangePromptText = new JLabel("Please enter a range(NUMBER)", SwingConstants.CENTER);
            rangePromptText.setFont(new Font("Consolas", Font.BOLD, 18));
            rangePromptText.setForeground(new Color(0x000000));
            rangePromptText.setForeground(new Color(0xffffff));
            // rangePromptText.add(new JLabel(new ImageIcon("C:\\Users\\admin\\Documents\\user\\student\\jasmyre\\code\\java\\Guess-the-number\\src\\logo.png")));

            JLabel rangePromptIcon = new JLabel(new ImageIcon("./logo-resize.png"));
            // rangePromptIcon.setPreferredSize(new Dimension(150, 100));

            JPanel rangePromptPanel = new JPanel();
            rangePromptPanel.setLayout(new GridLayout(2, 1));
            rangePromptPanel.setBackground(new Color(0x000000));
            rangePromptPanel.add(rangePromptIcon);
            rangePromptPanel.add(rangePromptText);

            int range = Integer.parseInt(JOptionPane.showInputDialog(rangePromptPanel));
            double number;
            boolean playAgain = true;

            do {
                number = Math.ceil(Math.random() * range);
                System.out.println("Number: " + number);
    
                do {
                    JLabel guessPromptText = new JLabel("Enter a guess from 1 - " + range + ":");
                    guessPromptText.setFont(new Font("Consolas", Font.BOLD, 18));
                    guessPromptText.setForeground(new Color(0x000000));

                    String guessSTR = JOptionPane.showInputDialog(guessPromptText);
                    if (guessSTR == null) {
                        break;
                    }
        
                    if (guessSTR.length() > 0) {
                        int guess = Integer.parseInt(guessSTR);
        
                        try {
                            if (guess > number) {
                                JLabel higherMessage = new JLabel("The guess is higher than the number.");
                                higherMessage.setFont(new Font("Consolas", Font.BOLD, 18));
                                higherMessage.setForeground(new Color(0x000000));

                                JOptionPane.showMessageDialog(null, higherMessage);
                            } else if (guess < number) {
                                JLabel lowerMessage = new JLabel("The guess is lower than the number.");
                                lowerMessage.setFont(new Font("Consolas", Font.BOLD, 18));
                                lowerMessage.setForeground(new Color(0x000000));

                                JOptionPane.showMessageDialog(null, lowerMessage);
                            } else if (number == guess) {
                                JLabel guessedMessage = new JLabel("You guessed the NUMBER!!");
                                guessedMessage.setFont(new Font("Consolas", Font.BOLD, 18));
                                guessedMessage.setForeground(new Color(0x000000));

                                JOptionPane.showMessageDialog(null, guessedMessage);
                                
                                break;
                            } else {
                                JLabel invalidMessage = new JLabel("Invalid Input");
                                invalidMessage.setFont(new Font("Consolas", Font.BOLD, 18));
                                invalidMessage.setForeground(new Color(0x000000));
                                JOptionPane.showMessageDialog(null, invalidMessage);
                            }
                        } catch (Exception e) {
                            // TODO: handle exception
                            JLabel exceptionMessage = new JLabel("Please enter a valid Number!");
                                exceptionMessage.setFont(new Font("Consolas", Font.BOLD, 18));
                                exceptionMessage.setForeground(new Color(0x000000));
                            JOptionPane.showMessageDialog(null, exceptionMessage);
                        }
                    }
                } while (playAgain);
    
            } while (false);

            JLabel playAgainMessage = new JLabel("Do you want to continue playing?");
            playAgainMessage.setFont(new Font("Consolas", Font.BOLD, 18));
            playAgainMessage.setForeground(new Color(0x000000));

            int playAgainPrompt = JOptionPane.showConfirmDialog(null, playAgainMessage, "Play again?", JOptionPane.YES_NO_OPTION);
    
            if (playAgainPrompt == 0) {
                continue;
            } else {
                break;
            }

        } while (true);
        
    }
}