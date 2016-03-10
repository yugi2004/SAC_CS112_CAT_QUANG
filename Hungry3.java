import java.util.Scanner;
// Lap 3 implement lap F4 java - Week5 
public class Hungry3
{
	public static void main(String[] args){
		int thirsty;
		int breakf;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Hungry\n");
		System.out.print("Get in line\n");
		System.out.print("Buy lunch\n");
		System.out.println("Is thirsty ?");
		System.out.println("Please enter 1 if thirsty , 0 if not");
		thirsty= input.nextInt();
			
		if(thirsty==1)
		{
			System.out.println("Have you breakfast?");
			System.out.println("please enter 1 if yes , 0 if no");
			
			breakf= input.nextInt();
			if(breakf==1)
				System.out.println("Buy diet coke");
			else
				System.out.println("Buy Coke");
		}
		else 
			System.out.print("Get Water\n");
		
		
		System.out.println("Eat lunch");
		System.out.println("return lunch");
		System.out.println("Leave");
	}
}