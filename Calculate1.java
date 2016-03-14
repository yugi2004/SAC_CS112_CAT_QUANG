import java.util.Scanner;

public class Calculate1
{
	public static void main(String[] args)
	{
	     // TODO code application logic here
        	int num1;
		int num2;
		String operator="";
        String quit="N";
	
	Scanner input= new Scanner(System.in);
        do{
            System.out.print("Enter number 1:");
		num1=input.nextInt();
		System.out.print("Enter number 2:");
		num2=input.nextInt();
		System.out.print("please enter \"+\" or \"-\" or \"*\" or \"/\" :");
		operator=input.next();// nhap chuoi
                        if(operator.equals("+"))
                    System.out.printf("Result: %d + %d = %d",num1,num2,num1+num2);
                else if (operator.equals("-"))
                    System.out.printf("Result: %d - %d = %d",num1,num2,num1-num2);
                     else if(operator.equals("*"))
                         System.out.printf("Result: %d * %d = %d",num1,num2,num1*num2);
                        else if(operator.equals("/"))
                            System.out.printf("Result : %d / %d = %d", a,b,a/b);
                
                System.out.println("Do you want quit? Y or N");
                quit=input.next();
                if(quit.equalsIgnoreCase("y"))
                    System.out.println("Thank you, Bye!");
                
                
        }while(quit.equalsIgnoreCase("N"));
		
	
	}
}

// Good job, but I do recommend better variable names.  a,b,x are not easy to follow.  num1, num2 and operator will be
