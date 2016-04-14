import java.util.Scanner;


public class Lap2W9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber1 myRandom = new RandomNumber1();
		int high;
		int computerNum;
		int personNum;
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter you want a Random number max:");
		high=input.nextInt();
		
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		
		computerNum = myRandom.GetANumber(high);
		System.out.printf("Your number is : %d\n ",personNum);
		System.out.printf("Computer number is : %d\n ",computerNum);
		if(computerNum==personNum)
			System.out.println("your number is correct");
		if(computerNum>personNum)
			System.out.println("your number is too small");
		if(computerNum<personNum)
				System.out.println("your number is too big");
	}

}
