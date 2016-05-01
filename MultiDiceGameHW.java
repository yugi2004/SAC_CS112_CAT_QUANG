import java.util.Scanner;


public class MultiDiceGameHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		boolean playagain = true;
		DiceHW diceroll = new DiceHW("Mary", 1);
		System.out.printf("%s\nLose :%d\n Win:%d\n dice Number:%d", diceroll.GetName()
	              , diceroll.GetDiceLose(), diceroll.GetDiceWin()
	              , diceroll.GetDiceNumber());
		System.out.printf("%nHi %s, We start game ! Good luck !!%n" , diceroll.GetName());
		int guesChoice;
		String message;
		while(playagain)
		{
			System.out.println("Plese enter number of dice: ");
			diceroll.SetNumOfDice(input.nextInt());
			diceroll.DiceRoll();
			

	        System.out.print("\nEnter your guess(odd = 1; even = 2): ");
	        guesChoice=input.nextInt();
	        if(guesChoice == diceroll.GetDiceResult())
	         {
	          diceroll.SetDiceWin();
	          System.out.println("Your guess is correct!");
	         }
	        else{
	        	diceroll.SetDiceLose();
	            System.out.println("You Lose!");   
	         }
	        System.out.printf("%nDice number = %d %n", diceroll.GetDiceNumber());
	         System.out.println("\nPlay again?(y/n): ");
	         message=input.next();
	         
	         if (message.equalsIgnoreCase("N"))
	         {
	        	 playagain = false;
	         }
		}
		 System.out.printf("Total game played: %d\nTotal win: %d\nTotal loss: %d", diceroll.GetDiceCount(),diceroll.GetDiceWin(),diceroll.GetDiceLose());
	}

}
