import java.util.Scanner;
public class Lap5
{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int a;
		int b;
	
		System.out.printf("Pless enter 2 number : ");
		a=input.nextInt();// read number 1 from user
		
		b=input.nextInt();
		
		System.out.printf("Hello, you enter is %d and %d",a,b);
	}
}