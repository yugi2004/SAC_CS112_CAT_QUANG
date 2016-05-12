
public class TrippleDice extends DiceW13{
	private  int randomNumber;
	@Override
	public int Throw()
	{		
		randomNumber=3*super.Throw();
		return randomNumber;
	}
}
