
public class TicTac {
	private char[][] board; 
	private char playerMark; // nguoi choi danh dau bang x, computer danh dau bang o
	public TicTac() {
		
			        board = new char[3][3];
		
			        playerMark = 'x';
		
			        newBoard();		
	}
	// ham tra gia tri bang moi hoan toan
	public void newBoard() {			      
			        // Loop through rows
		    for (int i = 0; i < 3; i++) {
		                  // Loop through column
			            for (int j = 0; j < 3; j++) {
			                board[i][j] = '-';
			            }
	
			 }
	}
	public void printBoard() {
		System.out.println("-------------");
		 for (int i = 0; i < 3; i++) {			 
			 //quet hang doc cu moi o ta dung | de ve 
			 	            System.out.print("| ");		
			 	            
			 	            for (int j = 0; j < 3; j++) {
			 	            	// quet hang ngang , ta xuat hien gia tri trong o roi ta ngang cach moi o la |
			 	                System.out.print(board[i][j] + " | ");			 
			 	            }			 
			 	            System.out.println();			 
			 	            System.out.println("-------------");
			 
			         }
	}
	
	// hamg kiem tra day trong mang, neu 1 gia tri trong mang deu la "-" thi 3 o ngang va 3 o doc chua full
	public boolean isBoardFull() {
			        boolean isFull = true;			         
	
			        for (int i = 0; i < 3; i++) {// hang doc
				            for (int j = 0; j < 3; j++) {	//hang ngang
				            		if (board[i][j] == '-') 
				            		{	
				            				isFull = false;	
				            		}	
				            }		
			        }
			        return isFull;			        
	}
	// ham kiem tra theo cot hoac theo hang ( cho 3 o khac nhau)
	private boolean checkRowCol(char c1, char c2, char c3) {		
			        return ((c1 != '-') && (c1 == c2) && (c2 == c3));		
	// luu y gia tri o khong duoc la "-" ( tuc chua duoc danh)
	}
	// kiem tra xem hang ngang thang hay thua
	private boolean checkRowsForWin() {
		 for (int i = 0; i < 3; i++) {
			 if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true) {
				 	return true;
			 }
		 }
		  return false;
	 }
	 private boolean checkColumnsForWin() {
		 for (int i = 0; i < 3; i++) {
			 	            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true) {
			 	                return true;
			 	            }
			 	        }
			 	        return false;
	 }
	 private boolean checkDiagonalsForWin() {
		 	        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
	 }
	 //ham kiem tra gia tri trong cell do la gi
	 public boolean checkCell(int cell)
	 {
		 boolean check= true;
		 switch(cell){
			case 1:
					if((board[0][0]=='x')||(board[0][0]=='o'))
						check= false;
					break;
			case 2:
				if((board[0][1]=='x')||(board[0][1]=='o'))
					check= false;
				break;
			case 3:
				if((board[0][2]=='x')||(board[0][2]=='o'))
					check= false;
				break;
			case 4:
				if((board[1][0]=='x')||(board[1][0]=='o'))
					check= false;
				break;
			case 5:
				if((board[1][1]=='x')||(board[1][1]=='o'))
					check= false;
				break;
			case 6:
				if((board[1][2]=='x')||(board[1][2]=='o'))
					check= false;
				break;
			case 7:
				if((board[2][0]=='x')||(board[2][0]=='o'))
					check= false;
				break;
			case 8:
				if((board[2][1]=='x')||(board[2][1]=='o'))
					check= false;
				break;
			default:
				if((board[2][2]=='x')||(board[2][2]=='o'))
					check= false;
				break;
		 }
		 return check;
	 }
	 // ham cho phep nguoi nhap theo cell number
	 public void inputCell(int cell)
	 {
		 switch(cell){
			case 1:
					placeMark(0, 0);
					break;
			case 2:
				placeMark(0, 1);
				break;
			case 3:
				placeMark(0, 2);
				break;
			case 4:
				placeMark(1, 0);
				break;
			case 5:
				placeMark(1, 1);
				break;
			case 6:
				placeMark(1, 2);
				break;
			case 7:
				placeMark(2, 0);
				break;
			case 8:
				placeMark(2, 1);
				break;
			default:
				placeMark(2, 2);
				break;
		 }
	 }
	 public boolean placeMark(int row, int col) {
		 	        if ((row >= 0) && (row < 3)) {
		 	            if ((col >= 0) && (col < 3)) {
		 	                if (board[row][col] == '-') {
		 	                    board[row][col] = playerMark;
		 	                    return true;		 	                
		 	                    }
		 	            }
		 	        }
		 	        return false;
	 }
	 // doi giua nguoi va may tinh
	 public void changePlayer()
	 {
		 playerMark = (playerMark == 'x')?'o': 'x';
	 }
	 public boolean checkWin()
	 {
		 boolean win=false;
		 if((checkColumnsForWin()==true)||(checkDiagonalsForWin()==true)||(checkRowsForWin()==true))
			 win=true;
		 return win;
	 }
}
