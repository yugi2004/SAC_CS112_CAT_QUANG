import java.util.Random;
public class DiceW15 implements Runnable{
	private int count = 0;
	private int max=0;
	private int randomNumber;
	
	// lap 2
	private final String taskName;
	private final int sleepTime;
	private final static Random generator = new Random();
	/*
	public DiceW15(int max){
		this.max=max;// how many dice need throw
		generator.nextInt(5000);
	}
	*/
	// lap 2
	public DiceW15(int max,String taskName){
		this.max=max;// how many dice need throw
		this.taskName=taskName;
		sleepTime = generator.nextInt(5000);
	}
	public void Throw()
	{
		count++;
		randomNumber=( (int)(Math.random()*6 ) + 1 );
	}
	
	@Override
	public void run()
	{		
		/* Lap 1 do it
		String threadname= Thread.currentThread().getName();
		for (int i=1; i <= max; i++ )
		{		
			Throw();		
			System.out.printf("Thread : %s dice is : %d , count is : %d %n",threadname,randomNumber,count);
		}*/
		
		try{
			for (int i=1; i <= max; i++ )
			{		
				Throw();		
				System.out.printf("Thread : %s dice is : %d , count is : %d %n",taskName,randomNumber,count);
				Thread.sleep(sleepTime);// set sleep time for thread
			}
		}catch(InterruptedException exception)
		{
			System.out.printf("Thread : &s \n",taskName,"Terminated prematurely due to interruption");
		}
		System.out.printf("%s done sleeping \n",taskName);
	}
	
}
