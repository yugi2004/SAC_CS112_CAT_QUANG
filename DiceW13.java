//Lab 1 – Compile Time Polymorphism _Static Polymorphism
public class DiceW13 {
	private int randomNumber;
	public  int Throw()
	{
		randomNumber=( (int)(Math.random()*6 ) + 1 );
		return randomNumber;
	}
	public  int Throw(int dices)
	{
		randomNumber=dices * ( (int)(Math.random()*6 ) + 1 );
		return randomNumber;
	}
	public  int Throw(int dices, int bounces)
	{
		
		randomNumber=dices * ((int)(Math.random()*6)+1) + bounces;
		return randomNumber;
	}
}
