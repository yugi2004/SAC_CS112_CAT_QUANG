import java.util.Scanner;
public class Lap6
{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int a;
		int b;
		int sum;
		int difference;
		int product;
		int quotient;
		System.out.print("Enter the number 1:");
		a=input.nextInt();// read number 1 from user
		System.out.print("Enter the number 2:");
		b=input.nextInt();
		sum = a + b;
		System.out.printf("Sum is %d\n",sum);
		difference=a-b;
		System.out.printf("difference is %d\n",difference);
		product=a*b;
		System.out.printf("product is %d\n",product);
		quotient=a/b;
		System.out.printf("quotient is %d\n",quotient);
		
	}
}