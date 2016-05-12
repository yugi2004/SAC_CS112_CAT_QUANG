
public class TrippleDice extends DiceW13{
	private  int randomNumber;
	@Override
	public int Throw()
	{		
		randomNumber=super.Throw()+super.Throw()+super.Throw();
		return randomNumber;
	}
}
