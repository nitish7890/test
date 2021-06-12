package com.brizdgelabz.tictactoegame;

public class TicTacToeGame {     //Declare the name of class TicTacToeGame
	char[] board=new char[10];   //Declare the char type array its size is 10
		public  void createBoard() {     // Declare the method
		for(int i=1;i<board.length;i++) {
			board[i]=' ';
		}
		}	
	public static void main(String args[]) {    //main method
		TicTacToeGame tt=new TicTacToeGame();    //Define the object
		System.out.println("welcome in TicTacGame");
		    tt.createBoard();      //calling the method createBoard
	}

}
