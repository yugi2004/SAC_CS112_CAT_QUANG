
public class ThreeDice {
	private  DiceW13 D1,D2,D3;
	public  int Throw()
	{
		D1=new DiceW13();
		D2=new DiceW13();
		D3=new DiceW13();
		int randomDice;
		randomDice = (D1.Throw()+D2.Throw()+D3.Throw());			
		return randomDice;
	}
	public String toString()
	{
		return String.format("Random number of 3 dice is : %d", Throw());
	}
}
