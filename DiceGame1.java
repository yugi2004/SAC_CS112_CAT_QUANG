import javax.swing.JOptionPane;
public class DiceGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean stop=true;
		 String message;
		 String guess=null;
		 JOptionPane.showMessageDialog(null,"Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");
		 Dice diceRoll= new Dice();
		 while (stop) {
        	 
        	 guess=JOptionPane.showInputDialog("You are about to roll a Six-Sided Dice. Do you think it will be even or odd:(e/o)");
        	 guess = guess.toUpperCase();
        	if (diceRoll.CheckWin(guess))
        	 {                                
                  message = String.format("You guessed right! "
                         + "\nYou rolled a %d, which is %s.", diceRoll.DiceNumber(), diceRoll.DiceResult());
                 JOptionPane.showMessageDialog(null, message);
             }
             else {

            	 message= String.format("You guessed wrong. "
                         + "\nYou rolled a %d, which is %s.", diceRoll.DiceNumber(), diceRoll.DiceResult());
                 JOptionPane.showMessageDialog(null, message);
             }

        	 guess = JOptionPane.showInputDialog("Would you like to play again? (Y/N)");
        	 if(guess.equalsIgnoreCase("Y"))
        	 {
        		 stop=true;
        	   	 diceRoll.DiceRoll();
        	 }
        	 else 
        		 stop=false;
         }
		 diceRoll.DicePercent();
		 message=String.format("You have played %d games."
                 + "\nYou've won %.2f percent of your games."
                 + "\n\nYou've guessed Odd %.2f percent of the time."
                 + "\nYou've guessed Even %.2f percent of the time.", 
                 diceRoll.DiceCount(), diceRoll.DiceWinPercent(), diceRoll.DiceOddPercent(), diceRoll.DiceEvenPercent());
		 JOptionPane.showMessageDialog(null, message);
	}

}
