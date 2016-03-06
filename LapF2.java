import java.util.Scanner;
public class LapF2
{
	    public static void main(String[] args) {
        
        	Scanner input= new Scanner(System.in);
		String thirsty="";
		
		System.out.println("Hurry!");
		System.out.println("Get line");
		System.out.println("Buy Lunch");
		System.out.println("Is Thirsty ? Y or N");
		thirsty= input.next();
		thirsty = thirsty.toUpperCase();
		if(thirsty.equals("Y"))
			System.out.println("Buy Diet coke");
			else 
				{	
				
							System.out.println("Get Water");
				}
		System.out.println("Eat lunch");
		System.out.println("Return Tray!");
		System.out.println("Leave!");
    }
    
}