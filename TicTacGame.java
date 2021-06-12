public class TicTacGame {
	
	    char[] board=new char[10];
		public  void createBoard() {  
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		}	
	public static void main(String args[]) {
		TicTacGame ob=new TicTacGame();
		System.out.println("welcome in TicTacGame");
		    ob.createBoard();
	}

}
