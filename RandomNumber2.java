
public class RandomNumber2 {
	private double num=0;

	// lap 1 
	public double GetANumber_Between_1_and_10()

	{		
		num= 1 + (double) (Math.random()*10);
		return num;
	}
}
