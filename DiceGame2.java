import javax.swing.JOptionPane;


public class DiceGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namePlayer= null;
		String message=null;
		int diceCount=0;
		int playerGuess=0;
		int play = 1;
		diceCount=Integer.parseInt(JOptionPane.showInputDialog("Please tell me , How many dice you want to play?"));
		namePlayer=JOptionPane.showInputDialog("What's your name?");
		Dice1 dice = new Dice1(namePlayer,diceCount,0);
		message=String.format("Hi %s,\nWelcome to the Dice Game! Good luck!!", dice.GetName());
		do{
			playerGuess= Integer.parseInt(JOptionPane.showInputDialog("Please you choice 1-Odd or 2-Even!!!!!"));
			dice.DiceRoll();
			message=String.format("Dice number is %d", dice.DiceNumber());
			JOptionPane.showMessageDialog(null,message);
			if(playerGuess==1 && dice.CheckResult()==1)
			{
				JOptionPane.showMessageDialog(null, "You win!");
				dice.SetPoint(1);
			}else
				JOptionPane.showMessageDialog(null, "You lose..");
			play=Integer.parseInt(JOptionPane.showInputDialog("Do you want play again? 1-yes,2-no"));
		}while(play==1);
		JOptionPane.showMessageDialog(null, dice);
	}

}
