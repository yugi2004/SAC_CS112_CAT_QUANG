
public class Lap1W15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		for(int i=0;i<2;i++)
		{
			Runnable T1 = new DiceW15(25);// 25 is times to throw t1 object 1
			Thread W1 = new Thread(T1);// gan object cho Thread
			W1.setName(String.valueOf(10));
		      // Start the thread, never call method run() direct
			W1.start();    // se tu dong goi ham run() de thuc thi cau lenh
			
			Runnable T2 = new DiceW15(35);// 35 is times to throw, t2 object 2
			Thread W2 = new Thread(T2);
			W2.setName(String.valueOf(20));// gan gia tri name cho luong du lieu
			W2.start();
		}
		System.out.println("Completed");
	}

}
