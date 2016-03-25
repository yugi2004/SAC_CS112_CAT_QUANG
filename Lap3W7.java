import javax.swing.JOptionPane;
public class Lap3W7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String computerPlay=null;
		String personPlay; // input person
		String message;
		int computerInt;
		
		personPlay=JOptionPane.showInputDialog(null,"Welcome to a rock-paper-scissor game!\nPlease enter your move :\nRock=R,Paper=P, and Scissor=S");
		computerInt= 1+ (int)(Math.random()*3);   
               
        switch(computerInt)
        {
        	case 1: computerPlay = "R";
        		break;
        	case 2: computerPlay="P";
        		break;
        	default:
        			computerPlay="S";
        }
        
        message = String.format("Computer play is: %s\nyour Choice is: %s\n  ",computerPlay,personPlay);
        JOptionPane.showMessageDialog(null, message);
       // check who win!!
        switch(personPlay)
        {
        case "S":
        		if(computerPlay.equalsIgnoreCase(personPlay)) 
        			JOptionPane.showMessageDialog(null, "It's a Tie");
        		else
        		{
        			message= computerPlay.equalsIgnoreCase("P")? "You Win!!":"You lose";
        			JOptionPane.showMessageDialog(null, message);
        		}
        		break;
        case "P":
        	if(computerPlay.equalsIgnoreCase(personPlay)) 
    			JOptionPane.showMessageDialog(null, "It's a Tie");
    		else
    		{
    			message= computerPlay.equalsIgnoreCase("R")? "You Win!!":"You lose";
    			JOptionPane.showMessageDialog(null, message);
    		}
    		break;
    	default:
    		if(computerPlay.equalsIgnoreCase(personPlay)) 
    			JOptionPane.showMessageDialog(null, "It's a Tie");
    		else
    		{
    			message= computerPlay.equalsIgnoreCase("S")? "You Win!!":"You lose";
    			JOptionPane.showMessageDialog(null, message);
    		}
    		break;
        }
        JOptionPane.showMessageDialog(null, "Thank you! bye! See you soon");
	}

}
