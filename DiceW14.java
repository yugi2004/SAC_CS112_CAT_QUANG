
public class DiceW14 implements RandomNumber{
   
	private int count = 0;
	private int randomNumber;
	public DiceW14()
	{
		Throw();
	}
	@Override
		public void Throw()
		{
			count++;
			randomNumber=( (int)(Math.random()*6 ) + 1 );

		}

	@Override
	public int getRandomNumber()
	{		
		return randomNumber;
	}
	@Override
	public int getCount()
	{
		return count;
	}
	public String toString()
	{
		return String.format("%s%d%s : %S%n","This is ",getCount()," times. Throw Dice is : ",getRandomNumber() );
	}
}
