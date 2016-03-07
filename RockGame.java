import java.util.Scanner;
import java.util.Random;

public class RockGame {

    public static void main(String[] args) {
      
        String personPlay;// bien luu tru nguoi choi , input person play
        String computerPlay="";        // khoi tao gia ri cho compuer
        int computerInt;// su dung so de random ra so int
        Scanner scan = new Scanner(System.in); 
        Random generator= new Random();
        System.out.println("Welcom to a rock-paper-scissor game!\n Please enter your move\"Rock=R,Paper=P, and Scissor=S\" :");
         personPlay = scan.next();
		 
        //radom computer's play (0,1,2)  
        computerInt=generator.nextInt(3); // ham random tra ra gia tri 0,1,2
        //System.out.printf("test ham random: %d \n",computerInt);  hamg test random dung  hay khong?
        if (computerInt == 0) 
           computerPlay = "R"; 
        else if (computerInt == 1) 
                computerPlay = "P"; 
             else if (computerInt == 2) 
                  computerPlay = "S"; 
        personPlay = personPlay.toUpperCase(); // Chuyen doi chu nho thanh chu Hoa, switch Lowcase to Uppercase;
        System.out.printf("Computer play is: %s\n ",computerPlay);
        //check who won. Use  if:
                if (personPlay.equals(computerPlay)) 
                     System.out.println("the result is a draw!"); 
                 else if (personPlay.equals("R")) 
                          { if (computerPlay.equals("S")) 
                                    System.out.println("Rock crushes scissors. You win!!");
                            else if (computerPlay.equals("P")) 
                              System.out.println("Paper eats rock. You lose!!"); 
						   }	  
                else if (personPlay.equals("P")) 
                                {if (computerPlay.equals("S")) 
                                       System.out.println("Scissor cuts paper. You lose!!"); 
                                 else if (computerPlay.equals("R")) 
                                            System.out.println("Paper eats rock. You win!!"); 
								}			
                      else if (personPlay.equals("S")) 
                                {if (computerPlay.equals("P")) 
                                             System.out.println("Scissor cuts paper. You win!!"); 
                                else if (computerPlay.equals("R")) 
                                            System.out.println("Rock breaks scissors. You lose!!"); 
								}			
                         else 
                                 System.out.println("Invalid user input."); 
            }
            
}
    
//Good job!
