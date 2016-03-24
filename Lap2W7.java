
import javax.swing.JOptionPane;

public class Lap2W7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personPlay;//  input person play
	    String computerPlay=null;    
	    String message;
	    int computerInt;
	    
	     
	    // Scanner scan = new Scanner(System.in);
	    
	    personPlay=JOptionPane.showInputDialog(null,"Welcome to a rock-paper-scissor game!\nPlease enter your move :\nRock=R,Paper=P, and Scissor=S");
        
        // //radom computer's play (1,2,3)
        
        computerInt= 1+ (int)(Math.random()*3);   
        if (computerInt ==1) 
            computerPlay = "R"; 
             else computerPlay=(computerInt==2)? "P": "S";
        
        message= String.format("Computer play is: %s\n your Choice is: %s\n  ",computerPlay,personPlay);
        JOptionPane.showMessageDialog(null, message);
     
        //check who won. Use  if:
        if (personPlay.equalsIgnoreCase(computerPlay))
        	JOptionPane.showMessageDialog(null, "it is a tie!!!!!!");
        else if ((personPlay.equalsIgnoreCase("S") && computerPlay.equalsIgnoreCase("R"))||(personPlay.equalsIgnoreCase("R") && computerPlay.equalsIgnoreCase("P"))||(personPlay.equalsIgnoreCase("P") && computerPlay.equalsIgnoreCase("S"))) 
                 { 
        			JOptionPane.showMessageDialog(null, "Computer Win !! You Lose!!");
				   }	  
        	 else
        		 JOptionPane.showMessageDialog(null, "You Win !! Computer Lose!!");

	}
}


