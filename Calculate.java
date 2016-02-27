import java.util.Scanner;
import java.io.IOException;
public class Calculate
{
	public static void main(String[] args)
	{
	int a;
	int b;
	int KQ;
	String x="";
	
	Scanner input= new Scanner(System.in);
		System.out.print("Enter number 1:");
		a=input.nextInt();
		System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" :");
		x=input.next();// nhap chuoi
		System.out.print("Enter number 2:");
		b=input.nextInt();
	while(x!="q")
		{		
		if (x.equals("+"))
			{	KQ=a+b;
				a=KQ;
				System.out.printf("Result: %d\n",KQ);
				System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
				x=input.next();// nhap chuoi
				System.out.print("Enter number next:");
				b=input.nextInt();
			}
		else{
				if  (x.equals("-"))
				{
					KQ=a-b;
					a=KQ;
					System.out.printf("Result: %d\n",KQ);
					System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
					x=input.next();// nhap chuoi
					System.out.print("Enter number next:");
					b=input.nextInt();
				}
				else{
						if  (x.equals("*"))
						{	
							KQ=a*b;
							a=KQ;
							System.out.printf("Result: %d\n",KQ);
							System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
							x=input.next();// nhap chuoi , input strin
							System.out.print("Enter number next:");
							b=input.nextInt();
						}
						else{
								if  (x.equals("/"))// ham so sanh 2 chuoi , compare 2 String
								{
									KQ=a/b;
									a=KQ;
									System.out.printf("Result: %d\n",KQ);
									System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
									x=input.next();// nhap chuoi
									System.out.print("Enter number next:");
									b=input.nextInt();
								}
								else{
									x="q";
								}
						}
				}
			}
			
		}
	
	}
}