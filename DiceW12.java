//Lab 1 – Compile Time Polymorphism _Static Polymorphism
public class DiceW12 {
	private static int randomNumber;
	public static int Throw()
	{
		randomNumber=( (int)(Math.random()*6 ) + 1 );
		return randomNumber;
	}
	public static int Throw(int dices)
	{
		randomNumber=dices * ( (int)(Math.random()*6 ) + 1 );
		return randomNumber;
	}
	public static int Throw(int dices, int bounces)
	{
		
		randomNumber=dices * ((int)(Math.random()*6)+1) + bounces;
		return randomNumber;
	}
}
