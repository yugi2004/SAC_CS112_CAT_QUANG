import java.util.Scanner;


public class Lap3W9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber1 myRandom = new RandomNumber1();
		int randomNumberMax;
		int randomNumberMin;
		int computerNum;
		int personNum;
		int times=0;
		String tooBig="your number is too big";
		String tooSmall="your number is too small";
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter you want a Random number max:");
		randomNumberMax=input.nextInt();
		System.out.println("Please enter you want a Random number min:");
		randomNumberMin=input.nextInt();
		while(times<=3)
		{
		System.out.println("Please enter your number:");
		personNum=input.nextInt();
		
		computerNum = myRandom.GetANumber(randomNumberMin,randomNumberMax);
		System.out.printf("Your number is : %d\n ",personNum);
		System.out.printf("Computer number is : %d\n ",computerNum);
		if(computerNum==personNum)
			System.out.println("your number is correct");
		else
			{	
				String messageS = (computerNum>personNum) ? tooBig : tooSmall;
				System.out.println(messageS);
			}
		System.out.printf("You finised %d times!\n",times++);
			}
		System.out.println("Bye!!!!");	
	}

}
