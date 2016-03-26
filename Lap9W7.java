import javax.swing.JOptionPane;

public class Lap9W7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personPlay;//  input person play
	    String computerPlay=null;    
	    String message;
	    int computerInt;
	    int[] resultArry= new int[10];// 0: tie ; 1 : win ; 2 : lose
	     
	    JOptionPane.showMessageDialog(null, "you have 10 times plays!");
	
	    for(int t=0;t<=9;t++)
	    {
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
        {
        	JOptionPane.showMessageDialog(null, "it is a tie!!!!!!");
        	resultArry[t]=0;
        }
        else if ((personPlay.equalsIgnoreCase("S") && computerPlay.equalsIgnoreCase("R"))||(personPlay.equalsIgnoreCase("R") && computerPlay.equalsIgnoreCase("P"))||(personPlay.equalsIgnoreCase("P") && computerPlay.equalsIgnoreCase("S"))) 
                 { 
        			JOptionPane.showMessageDialog(null, "Computer Win !! You Lose!!");
        			resultArry[t]=2;
                 }	  
        	 else
        	 {
        		 JOptionPane.showMessageDialog(null, "You Win !! Computer Lose!!");
        		 resultArry[t]=1;
        	 }
	    }
	    int countT=0;
	    int countL=0;
	    int countW=0;
	    /// show result person Play
	    for(int i=0;i<=9;i++)
	    {
	    	if(resultArry[i]==0)
	    		countT++;
	    	else 	if(resultArry[i]==1)
	    		countT=countW++;
	    		else
	    			countL++;
	    }
	    message= String.format("Result is : \nTie : %d\nWin : %d\nLose : %d\n", countT,countW,countL);
	    JOptionPane.showMessageDialog(null, message);
	    
	}
}
