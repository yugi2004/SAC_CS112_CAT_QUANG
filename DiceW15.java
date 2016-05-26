
public class DiceW15 implements Runnable{
	private int count = 0;
	private int max=0;
	private int randomNumber;
	public DiceW15(int max){
		this.max=max;// how many dice need throw
		
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
		String threadname= Thread.currentThread().getName();
		for (int i=1; i <= max; i++ )
		{		
			Throw();		
			System.out.printf("Thread : %s dice is : %d , count is : %d %n",threadname,randomNumber,count);
		}
	}
	
}
