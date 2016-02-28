import java.util.Scanner;

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
		System.out.print("Enter number 2:");
		b=input.nextInt();
		System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
		x=input.next();// nhap chuoi
		
			while(x!=null)
			{		
			if (x.equals("+"))
				{	
					KQ=a+b;
					a=KQ;
					System.out.printf("Result: %d\n",KQ);

				}
				else if  (x.equals("-"))
					{
						KQ=a-b;
						a=KQ;
						System.out.printf("Result: %d\n",KQ);	
					
					}
					else if  (x.equals("*"))
						{	
							KQ=a*b;
							a=KQ;
							System.out.printf("Result: %d\n",KQ);
						}
						else if  (x.equals("/"))// ham so sanh 2 chuoi , compare 2 String
								{
									KQ=a/b;
									a=KQ;
									System.out.printf("Result: %d\n",KQ);

								}
								else 
									{
										System.out.print("Bye!!!!");
										break;
									}
					System.out.print("Enter number next:");
					b=input.nextInt();
					System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" or \"q\" ( Quit) :");
					x=input.next();// nhap chuoi

			}
		
	
	}
}