import java.util.Scanner;


public class Lap5w6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int computerNum;
		int personNum;
		int times=1;
		String tooBig="your number is too big";
		String tooSmall="your number is too small";
		
		
		System.out.println("You have 3 times play");
		// use do{.....}while();
		do
		{
			computerNum = 1 + (int) (Math.random () * 10); ///  random of math 
			Scanner input= new Scanner(System.in);
			System.out.println("Please enter your number:");
			personNum=input.nextInt();
			System.out.printf("Your number is : %d\n ",personNum);
			System.out.printf("Computer number is : %d\n ",computerNum);
			if(computerNum==personNum)
				System.out.println("your number is correct");
			else
				{	
					String messageS = (computerNum>personNum) ? tooBig : tooSmall;
					System.out.println(messageS);
				}
			System.out.printf("You finised %d times!\n",times++);//times =1 and after that time=times +1 
		}while(times<=3);
		System.out.println("Bye!!!!");
	}

}
