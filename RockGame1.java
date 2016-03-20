package week6homework;
import java.util.Scanner;
// use math.random lam random, do.. while , if else ....
public class RockGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String personPlay;// bien luu tru nguoi choi , input person play
	     String computerPlay=null;        // khoi tao gia ri cho compuer
	     int computerInt; // theo doi bien random cua computer
	     String loopG=null; 
	     do{
	     Scanner scan = new Scanner(System.in);    
	     System.out.println("Welcom to a rock-paper-scissor game!\n Please enter your move\"Rock=R,Paper=P, and Scissor=S\" :");
         personPlay = scan.next();
         
         // //radom computer's play (0,1,2)
         
         computerInt= 0 + (int)(Math.random()*3);//random tu 0-2, use int de lam tron bien thanh so chan
         System.out.printf("computer random is %d \n",computerInt);
         
         String result;
         if (computerInt == 0) 
             computerPlay = "R"; 
              else computerPlay=(computerInt==1)? "p": "s";
         
         System.out.printf("Computer play is: %s\n ",computerPlay);

         //check who won. Use  if:
         if (personPlay.equalsIgnoreCase(computerPlay))
             	System.out.println("the result is a draw!"); 
         else if (personPlay.equalsIgnoreCase("R")) 
                  { 
        	 		// if computer == S then win. if not compuer == p thi lose
                    result=(computerPlay.equalsIgnoreCase("S"))? "Rock crushes scissors. You win!!": "Paper eats rock. You lose!!";
                    System.out.println(result); 
				   }	  
         			else if (personPlay.equals("P")) 
                        {
         				//if compuer == S thi ban thua, neu computer la R thi ban thang
         					result=(computerPlay.equalsIgnoreCase("S"))? "Scissor cuts paper. You lose!!":"Paper eats rock. You win!!";
         					System.out.println(result); 
						}			
         					else if (personPlay.equals("S")) 
         						{
         						// if computer --P you win, nguoc lai ban thua
         							result=(computerPlay.equalsIgnoreCase("P"))? "Scissor cuts paper. You win!!":"Rock breaks scissors. You lose!!";
         							System.out.println(result); 
         						}			
         					  	else 
         					  			System.out.println("Invalid user input."); 
         System.out.println("Do you want to play game again? Y or N");
         loopG= scan.next();
	     }while (loopG.equalsIgnoreCase("Y"));
	     System.out.println("Bye!!!!!!!!");
	}

}
//Good job
