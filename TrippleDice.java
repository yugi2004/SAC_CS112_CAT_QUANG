
public class TrippleDice extends DiceW13{
	private  int randomNumber;
	@Override
	public int Throw()
	{		
		randomNumber=super.Throw(3);
		return randomNumber;
	}
}
