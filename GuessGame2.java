import java.util.Scanner;

public class GuessGame2 {

public static void main(String[] args) {

Scanner input = new Scanner (System.in);
double randomNum = 1+(Math.random()*10);
double number1;
RandomNumber2 randomNumber= new RandomNumber2();

randomNum=randomNumber.GetANumber_Between_1_and_10();



System.out.print("Please enter a number between 1 and 10: ");
number1= input.nextDouble();

if (number1==randomNum)
System.out.printf("Congrats, you guessed it. The correct number is %f\n",
randomNum);
else if (number1 > randomNum)
System.out.println("Your number is too large.");
else
System.out.println("Your number is too small.");

}

}