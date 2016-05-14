import java.util.Scanner;
public class DiceTestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		DiceL5 dice = new DiceL5();

		int check = 0;

		do
		{
			System.out.print("Press 1 to role dice: ");
			check = input.nextInt();
			
			try
			{
				int diceNum = dice.Throw();
				System.out.println("Dice Number is "+diceNum);

				System.out.println("Dice count is "+dice.getDiceCount());

			
			}
			catch (IllegalArgumentException illegalArgumentException)
			{
				System.out.println("Dice can only role 3 times");
			}
		}
		while (check ==1);	
	}
}
