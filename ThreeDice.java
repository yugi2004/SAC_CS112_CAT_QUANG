
public class ThreeDice {
	private  DiceW12 D1,D2,D3;
	public  int Throw()
	{
		int randomDice;
		randomDice = (D1.Throw()+D2.Throw()+D3.Throw())/3;			
		return randomDice;
	}
}
