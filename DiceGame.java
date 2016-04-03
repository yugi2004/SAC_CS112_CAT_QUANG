import javax.swing.JOptionPane;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int diceRoll=0;
		 boolean stop=true;
		 String message;
		 int win=0;

         int count=0;
         int oddNumber=0;
         int evenGuess=0;
         String diceResult=null;
         String guess=null;
         double winPercent;
         double oddPercent;
         double evenPercent;
		JOptionPane.showMessageDialog(null,"Welcome to a Lucky (for me) Dice Game! \nFEELING LUCKY?!? Hope you brought lots of CASH!");
				 
         while (stop) {
        	 count++;
        	 diceRoll=(int)(Math.random()*6+1);
        	 if (diceRoll % 2 != 0) {
        		 diceResult="Odd";
        	 }
        	 else
        		 {
        		 diceResult="Even";
        		 }
        	 guess=JOptionPane.showInputDialog("You are about to roll a Six-Sided Dice. Do you think it will be even or odd:(e/o)");
        	 guess = guess.toUpperCase();
        	 if (guess.equals("O"))
                 oddNumber++;
             else
                 evenGuess++;
        	 if ((guess.equals("O") && diceResult.equals("Odd"))||((guess.equals("E")) && (diceResult.equals("Even"))))
        	 {
                 win++;                 
                  message = String.format("You guessed right! "
                         + "\nYou rolled a %d, which is %s.", diceRoll, diceResult);
                 JOptionPane.showMessageDialog(null, message);
             }
             else {

            	 message= String.format("You guessed wrong. "
                         + "\nYou rolled a %d, which is %s.", diceRoll, diceResult);
                 JOptionPane.showMessageDialog(null, message);
             }

        	 guess = JOptionPane.showInputDialog("Would you like to play again? (Y/N)");
        	 stop=guess.equalsIgnoreCase("Y")?true:false;
         }
         winPercent=((win*100)/count);
         oddPercent=((oddNumber*100)/count);
         evenPercent = ((evenGuess*100)/count	);
         message=String.format("You have played %d games."
                 + "\nYou've won %.2f percent of your games."
                 + "\n\nYou've guessed Odd %.2f percent of the time."
                 + "\nYou've guessed Even %.2f percent of the time.", 
                 count, winPercent, oddPercent, evenPercent);
         JOptionPane.showMessageDialog(null, message);
	}

}
