
public class DiceW15 implements Runnable{
	private int count = 0;
	private int max=0;
	private int randomNumber;
	public DiceW15(int max){
		this.max=max;
		
	}
	public void Throw()
	{
		count++;
		randomNumber=( (int)(Math.random()*6 ) + 1 );
	}
	public int getRandomNumber()
	{		
		return randomNumber;
	}
	public int getCount()
	{
		return count;
	}
	@Override
	public void run()
	{		
		String t= Thread.currentThread().getName();
		for (int i=1; i <= max; i++ )
		{		
			Throw();		
			System.out.printf("Thread : %s dice is : %d , count is : %d %n",t,randomNumber,count);
		}
	}
	
}
