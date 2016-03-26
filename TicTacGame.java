import javax.swing.JOptionPane;

public class TicTacGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTac gameN= new TicTac();
		int personPlay=0;
		int computerPlay=0;
		boolean checkValue=false;
		boolean checkGame=false;
		boolean win=false;
		boolean lose=false;
		while(lose==false||win==false){
		gameN.printBoard();
		if(gameN.isBoardFull()!=true){
			do{
				String var=JOptionPane.showInputDialog("Please choice you cell number(1->9) :");
				personPlay= Integer.parseInt(var);
				checkValue=gameN.checkCell(personPlay);
				
				}while(checkValue!=true);
			gameN.inputCell(personPlay);			
			win=gameN.checkWin();
			gameN.changePlayer();			
			JOptionPane.showMessageDialog(null, "Change player\nCompuer Play!");
		}
		else lose=true;
		if(gameN.isBoardFull()!=true||win==false||lose==false)
			{do{		
				// compuer random;
				computerPlay=0+(int) (Math.random()*9);
				checkGame=gameN.checkCell(computerPlay);
				
				}while(checkGame!=true);
			JOptionPane.showMessageDialog(null,"compuer choice is :"+ computerPlay);
			gameN.inputCell(computerPlay);
			gameN.changePlayer();
			JOptionPane.showMessageDialog(null, "Change player\nCompuer Play!");
			lose=(gameN.checkWin()==true||gameN.isBoardFull()==true)?true:false;
			}
		else lose=(win==true)?false:true;
		}
		gameN.printBoard();
		String message=(win==true)?"You win!":"You lose";
		JOptionPane.showMessageDialog(null, message);
		
	}

}
