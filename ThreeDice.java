
public class ThreeDice {
	private  DiceW13 D1,D2,D3;
	public  int Throw()
	{
		int randomDice;
		randomDice = (D1.Throw()+D2.Throw()+D3.Throw());			
		return randomDice;
	}
	public String toString()
	{
		return String.format("Random number of 3 dice is : %d", Throw());
	}
}
