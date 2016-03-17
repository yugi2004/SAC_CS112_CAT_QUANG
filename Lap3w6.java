import java.util.Scanner;

// Lap 3  - Week6 
public class Lap3w6
{
	public static void main(String[] args){
		int computerNum;
		int personNum;
		computerNum = 1 + (int) (Math.random () * 10); ///  random of math 
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		System.out.printf("Your number is : %d\n ",personNum);
		System.out.printf("Computer number is : %d\n ",computerNum);
		if(computerNum==personNum)
			System.out.println("your number is correct");
		else if(computerNum>personNum)
			System.out.println("your number is too small");
			else // computerNum < personNum
				System.out.println("your number is too big");
		
	}
}