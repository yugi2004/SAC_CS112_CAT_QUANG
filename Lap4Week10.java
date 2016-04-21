import java.util.Scanner;


public class Lap4Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int myRandomNum ;		
		int numberGuess;
		int lowNumber;
		int highNumber;
		
		// set low number random  &&  high number random
		System.out.print("Please enter a number low random: ");
		lowNumber= input.nextInt();
		
		System.out.print("Please enter a number high random: ");
		highNumber= input.nextInt();
		
		RandomNumber5 randomNumber= new RandomNumber5(lowNumber,highNumber);
		
		//Verify lower and upper boundary
		System.out.printf("Please enter a number between %d and %d: ",randomNumber.GetLowNumber(),randomNumber.GetHighNumber());
		numberGuess=input.nextInt();
		
		myRandomNum=randomNumber.GetANumber();
		
		// check game
		if (numberGuess==myRandomNum)
		System.out.printf("Congrats, you guessed it. The correct number is %d\n",numberGuess);
		else if (numberGuess > myRandomNum)
		System.out.printf("Your number is too large. You number is %d , computer number is %d ",numberGuess,myRandomNum);
		else
		System.out.printf("Your number is too small.You number is %d , computer number is %d ",numberGuess,myRandomNum);
	}

}
