
public class RandomNumber4 {
	private int num=0;
	private int max=0;
	// lap 3 Week 10 
	public RandomNumber4(int high)
	{		
		//Random a number between 0 and High
		max=high;
	}
	public int GetANumber()
	{
		//Returns a number between 0 and High
		num= (int) (Math.random()* max);
		return num;
	}
}
