
public class Lap1W15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		for(int i=0;i<2;i++)
		{
			Runnable T1 = new DiceW15(25);
			Thread W1 = new Thread(T1);//  object to Thread
			W1.setName(String.valueOf(10));
		      // Start the thread, never call method run() direct
			W1.start();    
			
			Runnable T2 = new DiceW15(35);
			Thread W2 = new Thread(T2);
			W2.setName(String.valueOf(20));//name to thread 2
			W2.start();
		}
		System.out.println("Completed");
	}

}
