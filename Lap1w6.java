import java.util.Scanner;

// Lap 1  - Week6 
public class Lap1w6
{
	public static void main(String[] args){
		int computerNum;
		int personNum;
		computerNum = 1 + (int) (Math.random () * 10);
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		System.out.printf("Your number is : %d\n ",personNum);
		if(computerNum==personNum)
			System.out.println("your number is correct");
		if(computerNum>personNum)
			System.out.println("your number is too small");
		if(computerNum<personNum)
				System.out.println("your number is too big");
		
	}
}
