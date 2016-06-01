import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Lap3W15 {
	//class SharedArray Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		// tao day~ theo thread 
		SingleArray shareTaskArray= new SingleArray(12);
		// 3 dice de ghi vao arry
		DiceW15 task1 = new DiceW15(3,"task 1",shareTaskArray);
		DiceW15 task2 = new DiceW15(4,"task 2",shareTaskArray);
		DiceW15 task3 = new DiceW15(5,"task 3",shareTaskArray);
		
		System.out.println("Starting Executor....");
		// cach thuc thi thread
		ExecutorService threadExcutor= Executors.newCachedThreadPool();
		threadExcutor.execute(task1);
		threadExcutor.execute(task2);
		threadExcutor.execute(task3);
		
		
		threadExcutor.shutdown();
		
		try
		{
			// co bat lay thread khi thread tam dung de ghi vao array
			boolean taskEnd = threadExcutor.awaitTermination(1, TimeUnit.MINUTES);
			////////////
			if(taskEnd)
			{
				System.out.println(shareTaskArray);// print contents
			}else{				
				System.out.println("Time out white waiting for task finish.");
			}
		}catch (InterruptedException ex)
		{
			System.out.println("Interrup while waiting for task to finish ");
		}
		
		//ket thuc thuc thi
		System.out.println("Task started Completed");
		
	}

}
