import java.util.Scanner;

public class Hurry1	
{
	public static void main(String[] args){
		int thirsty;
		Scanner input= new Scanner(System.in);
		
		System.out.print("Hurry\n");
		System.out.print("Get in line\n");
		System.out.print("Buy lunch\n");
		System.out.println("Is thirsty ?");
		System.out.println("Please enter 1 if thirsty , 0 if not");
		thirsty= input.nextInt();
			
		if(thirsty==1)
			System.out.println("Buy Coke");
		
		System.out.println("Eat lunch");
		System.out.println("return lunch");
		System.out.println("Leave");
	}
}