
public class RandomNumber5 {
	private int num=0;
	private int lo=0;
	private int hi=0;
	// lap 4 Week 10 
	public RandomNumber5(int high)
	{		
		//Random a number between 0 and High
		hi=high;
	}
	public RandomNumber5(int lo,int hi)
	{
		this.hi=hi;
		this.lo=lo;
	}
	private void GetANumber(int lo, int hi)
	{
		num=(int)(Math.floor(Math.random() * ((hi-lo)+1) + lo));
	}
	public int GetANumber()
	{			
		GetANumber(lo, hi);
		return num;
	}
	public int GetLowNumber()
	{
		return lo;
	}
	public int GetHighNumber()
	{
		return hi;
	}
}
