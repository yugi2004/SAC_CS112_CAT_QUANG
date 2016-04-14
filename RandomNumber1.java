
public class RandomNumber1 {
	private int num=0;

	// lap 1 
	public int GetANumber_Between_1_and_10()

	{		
		num= 1 + (int) (Math.random()*10);
		return num;
	}
	//lap 2 with you choice random number max 
	public int GetANumber(int high)
	{
		//Returns a number between 0 and High

		num= (int) (Math.random()*high);
		return num;
	}
	// Lap 3 you choice number random form x to y
	public int GetANumber(int lo, int hi)
	{
		
		 num=(int)(Math.floor(Math.random() * ((hi-lo)+1) + lo));
		return num;
	}
}
