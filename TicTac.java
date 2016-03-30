
public class TicTac {
	private String [][] board; 
	private String playerMark; // nguoi choi danh dau bang x, computer danh dau bang o
	public TicTac() {
		
			        board = new String[3][3];
		
			        playerMark = "x";
		
			        newBoard();		
	}
	public String markPlayer()
	{
		return playerMark;
				
	}
	// create new Array for board
	public void newBoard() {			      
			        // Loop through rows
		    for (int i = 0; i < board.length; i++) {
		                  // Loop through column
			            for (int j = 0; j < board[i].length; j++) {
			                board[i][j] = null;
			            }
	
			 }
	}
	public boolean isBoardFull() {     
		boolean fullBoard=true;
        for (int i = 0; i < board.length; i++) {// row
	            for (int j = 0; j < board[i].length; j++) {	//col
	            		if (board[i][j] == null) 
	            		{	
	            				fullBoard=false;	
	            		}	
	            }		
        }
        return fullBoard;			        
}
	public boolean checkCell(int cell)
	{
		switch(cell){
		case 1:
			if(board[0][0]==null)return true;	
			else 
				return false;
			
		case 2:
			if(board[0][1] ==null)return true;
			else 
				return false;
			
		case 3:
			if(board[0][2]==null) 
				return true;
			else 
				return false;
			
		case 4:
			if(board[1][0] ==null)return true;
			else 
				return false;
			
		case 5:
			if(board[1][1] ==null)return true;
			else 
				return false;
			
		case 6:
			if(board[1][2] == null)return true;
			else 
				return false;
			
		case 7:
			if(board[2][0] ==null )return true;
			else 
				return false;
			
		case 8:
			if(board[2][1] ==null)return true;
			else 
				return false;
			
		default:
			if(board[2][2] ==null)return true;
			else 
				return false;
			
	 }
	}
	public void printBoard() {
		System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(board[i][j]);
                }
                if (j < 2) {
                    System.out.print("|");
                } else {
                    System.out.println();
                } 
             }
         }
         System.out.println();
	}
	
	private boolean checkRowCol(String c1, String c2, String c3) {		
        return ((c1 != null) && (c1.equalsIgnoreCase(c2)) && (c2.equalsIgnoreCase(c3)));		
	}
	public boolean checkWin(){		
		for (int row = 0; row < board.length; row++) {
			 if (checkRowCol(board[row][0], board[row][1], board[row][2]) == true) 
				 	return true;	
		 }
		 for (int col = 0; col < board.length; col++) 
	            if (checkRowCol(board[0][col], board[1][col], board[2][col]) == true) 
	                return true;
	              
	        
		if(checkRowCol(board[0][0],board[1][1],board[2][2]))
			return true;
	   return false;
	}
	 
	 public void inputCell(int cell)
	 {
		 switch(cell){
			case 1:
				board[0][0] = playerMark;					
				break;
			case 2:
				board[0][1] = playerMark;
				break;
			case 3:
				board[0][2] = playerMark;
				break;
			case 4:
				board[1][0] = playerMark;
				break;
			case 5:
				board[1][1] = playerMark;
				break;
			case 6:
				board[1][2] = playerMark;
				break;
			case 7:
				board[2][0] = playerMark;
				break;
			case 8:
				board[2][1] = playerMark;
				break;
			default:
				board[2][2] = playerMark;
				break;
		 }
	 }
	
	 // change player and computer
	 public void changePlayer()
	 {
		 playerMark = (playerMark == "x")?"o": "x";
	 }
	
}
