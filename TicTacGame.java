import javax.swing.JOptionPane;

public class TicTacGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTac gameN= new TicTac();
		int personPlay=0;
		int computerPlay=0;
		String message;
		//////////////////////////////
		boolean checkValue=false;
		boolean checkGame=false;
		boolean win=false;
		boolean lose=false;
		///////////////////////////////
		while(win==false && lose== false &&gameN.isBoardFull()==false)
		{
			gameN.printBoard();		
			do{		String var=JOptionPane.showInputDialog("Please choice you cell number(1->9) :");
					personPlay= Integer.parseInt(var);		
					checkValue=(gameN.checkCell(personPlay));					
						}while(checkValue==false);
					
					gameN.inputCell(personPlay);
					win=((gameN.checkWin()==true)&&gameN.markPlayer().equalsIgnoreCase("x"));
					if(win==true)
						{message="You Win";
						JOptionPane.showMessageDialog(null, message);
						}
					else

						// change person to computer
						gameN.changePlayer();			
						JOptionPane.showMessageDialog(null, "Change player\nCompuer Play!");
						
			if(win==false&&lose==false)
			{
				if(gameN.isBoardFull()==false){
				do{		
				// computer random;
					computerPlay=0+(int) (Math.random()*9);
					checkGame=gameN.checkCell(computerPlay);				
					}while(checkGame!=true);
				JOptionPane.showMessageDialog(null,"compuer choice is :"+ computerPlay);
				gameN.inputCell(computerPlay);
				lose=((gameN.checkWin()==true)&&gameN.markPlayer().equalsIgnoreCase("o"));
				if(lose==true)
					{message="Computer Win";
					JOptionPane.showMessageDialog(null, message);
					}
				gameN.changePlayer();
				JOptionPane.showMessageDialog(null, "Change player\nCompuer Play!");
			  }
				else
					 break;
		
			}		    
		}
		gameN.printBoard();
		if(gameN.isBoardFull()==true&&win==false&&lose==false) 
			{
				message="it's a draw!";
				JOptionPane.showMessageDialog(null, message);
			}
		JOptionPane.showMessageDialog(null, "thank you !you played!");
		
	}

}
