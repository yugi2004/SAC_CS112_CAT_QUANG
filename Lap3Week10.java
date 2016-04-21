import java.util.Scanner;


public class Lap3Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int myRandomNum ;		
		int numberGuess;
		int highNumber;
		
		// set high number random
		System.out.print("Please enter a number high random: ");
		highNumber= input.nextInt();
		
		RandomNumber4 randomNumber = new RandomNumber4(highNumber);// with constructor setup highnumber random
		
		System.out.printf("Please enter a number between 0 and %d: ",highNumber);
		numberGuess=input.nextInt();
		
		myRandomNum = randomNumber.GetANumber();
		
		if (numberGuess==myRandomNum)
		System.out.printf("Congrats, you guessed it. The correct number is %d\n",numberGuess);
		else if (numberGuess > myRandomNum)
		System.out.printf("Your number is too large. You number is %d , computer number is %d ",numberGuess,myRandomNum);
		else
		System.out.printf("Your number is too small.You number is %d , computer number is %d ",numberGuess,myRandomNum);
	}

}
