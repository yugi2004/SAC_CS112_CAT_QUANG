
public class RandomNumber {
	private int num=0;
	public RandomNumber()
	{
		num= 1 + (int) (Math.random()*10);
	}
	
	public int GetANumber_Between_1_and_10()

	{		
		
		return num;
	}
	
}
