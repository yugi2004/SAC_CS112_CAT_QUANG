import java.util.Scanner;

// Lap 2 - Week6 
public class Lap2w6
{
	public static void main(String[] args){
		int computerNum;
		int personNum;
		computerNum = 1 + (int) (Math.random () * 10); /// ham random cua math 
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		System.out.printf("Your number is : %d\n ",personNum);
		System.out.printf("Computer number is : %d\n ",computerNum);
		if(computerNum==personNum)
			System.out.println("your number is correct");
		else 
		{	
			if(computerNum>personNum)
				System.out.println("your number is too small");
			else
				System.out.println("your number is too big");
		}
	}
}
