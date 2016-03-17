import java.util.Scanner;

// Lap 3b  - Week6 
public class Lap3bw6
{
	public static void main(String[] args){
		int computerNum;
		int personNum;
		int equalNum;
		computerNum = 1 + (int) (Math.random () * 10); ///  random of math 
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		System.out.printf("Your number is : %d\n ",personNum);
		System.out.printf("Computer number is : %d\n ",computerNum);
		equalNum=(computerNum==personNum)? 1 : 2;
		if(equalNum==2)
		{
			equalNum=(computerNum>personNum)? 1 : 2;
			if(equalNum==1)
				System.out.println("your number is too small");
			else
				System.out.println("your number is too big");

		}
		else
			System.out.println("your number is correct");
	}
}