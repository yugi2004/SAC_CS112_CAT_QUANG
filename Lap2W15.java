import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;
public class Lap2W15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		DiceW15 task1 = new DiceW15(25,"task 1");
		DiceW15 task2 = new DiceW15(45,"task 2");
		DiceW15 task3 = new DiceW15(15,"task 3");
		
		System.out.println("Starting Executor....");
		
		ExecutorService threadExcutor= Executors.newCachedThreadPool();
		threadExcutor.execute(task1);
		threadExcutor.execute(task2);
		threadExcutor.execute(task3);
		threadExcutor.shutdown();
		System.out.println("Task started Completed");
	}
}
