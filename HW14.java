import java.util.Scanner;


public class HW14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		AutomobileW14[] auto = new AutomobileW14[2];
		auto[0]= new SportCar(2015,"Lamborghini" , "Gallardo ","Red","Spyder Performante", 10, 0.32);
		auto[1]= new MiniVan(2016, "ToyoTa", "Sienna", "Yellow", "LE ", 7, 0.24);
		int cycle=0;
		for(AutomobileW14 currentauto : auto)
		{

			System.out.printf("%s %s :","Please input Operating Cycles of ",currentauto.getClass().getName());
			cycle=input.nextInt();
			currentauto.Drive(cycle);
			for(int i =1 ; i <13; i ++)
			{
				currentauto.Drive(cycle);
				System.out.printf("%.2f : %d ",currentauto.getSpeed(),currentauto.getGear());
				System.out.println(currentauto);
			}
		}
	}

}

// Good job!
