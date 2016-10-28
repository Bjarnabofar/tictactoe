package is.ru.tictactoe;

import java.util.*;
import is.ru.tictactoe.Cell;
import is.ru.tictactoe.Point;

/**
 * Board class contains functions regarding the board in tictactoe.
 * The class updates cells, check if cell is available and checks if there is 
 * a winner or tie
 * @author: Bjarnabofarnir
 */
public class Board
{
	private int size;
	private Cell[][] board;

	public enum Winner {
		winnerX,
		winnerO,
		NONE
	}

	/**
     * default constructor initialize tictactoe board with size 3
     */
	public Board()
	{
		size = 3;
		board = new Cell[size][size];
		initBoard();

	}

	/**
     * initialize cells with the sign '.'
     */
	public void initBoard(){
		for(int y = 0; y < getSize(); y++){
			for(int x = 0; x < getSize(); x++){
				board[y][x] = new Cell();
			}
		}
	}

	public int getSize(){
		return size;
	}

	/**
     * display function for console
     */
	public void displayBoard(){
		for(int y = 0; y < getSize(); y++){

			for(int x = 0; x < getSize(); x++){

				System.out.print(board[y][x].getSign());
				if(getSize()-1 != x)
				{
					System.out.print( " | ");
				}
			}
			if(getSize()-1 != y)
			{
				System.out.println();
				System.out.println("- - - - -");
			}
		}
		System.out.println();
	}

	/**
     * @param: Point Check if there is X or O in particular cell in point p
     */
	public boolean isAvailable(Point p){
		if(board[p.getX()][p.getY()].getSign() == 'X' || board[p.getX()][p.getY()].getSign() == 'O'){
			return false;
		}
		return true;
	}

	/**
     * @param: Point Updates the cell at corresponding point
     * @param: Updates the cell with the char in move 
     */
	public void updateBoard(Point p, char move){
		if(isAvailable(p)){
			board[p.getX()][p.getY()].setSign(move);
		}
	}

	/**
	 * @param: Point is the point we want to position the cell
     * @return: cell at the corresponding point
     */
	public Cell getCellAtPoint(Point p){
		return board[p.getX()][p.getY()];
	}


	/**
     * @return: return true if there is winner in the game
     */
	public boolean hasWinner(){

		if(checkRows() != Winner.NONE){
			return true;
		}
		else if (checkColumns() != Winner.NONE){
			return true;
		}
		else if (checkDiagonals() != Winner.NONE){
			return true;
		}

		return false;
	}

	/**
     * @return: checks if there is winner in rows. Returns WinnerX, WinnerO or NONE. If it returns for example WinnerX then X is the winner.
     * If it return NONE there is no winner.
     */
	private Winner checkRows(){

		int countX = 0;
		int countO = 0;

		for(int i = 0; i < getSize(); i++){
			for(int j = 0; j < getSize(); j++){
				if(board[i][j].getSign() == 'X'){
					countX++;
				}
				else if(board[i][j].getSign() == 'O'){
					countO++;
				}
				if(countX == getSize() || countO == getSize()){
					return getWinner(countX, countO);
				}
			}
			countX = 0;
			countO = 0;
		}

		return Winner.NONE;
	}

	/**
     * @return: checks if there is winner in columns. Returns WinnerX, WinnerO or NONE. If it returns for example WinnerX then X is the winner.
     * If it return NONE there is no winner.
     */
	private Winner checkColumns(){

		int countX = 0;
		int countO = 0;

		for(int i = 0; i < getSize(); i++){
			for(int j = 0; j < getSize(); j++){
				if(board[j][i].getSign() == 'X'){
					countX++;
				}
				else if(board[j][i].getSign() == 'O'){
					countO++;
				}
				if(countX == getSize() || countO == getSize()){
					return getWinner(countX, countO);
				}
			}
			countX = 0;
			countO = 0;
		}

		return Winner.NONE;
	}


	/**
     * @return: checks if there is winner in Diagonals. Returns WinnerX, WinnerO or NONE. If it returns for example WinnerX then X is the winner.
     * If it return NONE there is no winner.
     */
	public Winner checkDiagonals() {
		int countX = 0;
		int countO = 0;
		int j = 0;
		Winner w = Winner.NONE;
		
		// top left -> right bottom
	    for (int i = 0; i < getSize(); i++){
	        if (board[i][j].getSign() == 'X'){
	            countX++;
	        }
	        else if (board[i][j].getSign() == 'O'){
	            countO++;
	        }
	        j++;
	    }

	    w = getWinner(countX, countO);
	    if (w == Winner.NONE){
	    	countX = 0;
	    	countO = 0;
	    	j = getSize()-1;
	    	for(int i = 0; i < getSize(); i++){
	    		if (board[i][j].getSign() == 'X'){
	    			countX++;
	    		}
	    		else if (board[i][j].getSign() == 'O'){
	           		countO++;
	       		}
	       		j--;
	    	}
	    	w = getWinner(countX, countO);
	    }

	    return w;
	}

	/**
	 * @param: numX if numX is 3 then X is the winner. numO if numO is 3 then O is the winner
     * @return: returns the winnerX or winnerO if there is winner. If there is no winner it returns NONE
     */
	public Winner getWinner(int numX, int numO){
		if(numX == getSize()){
			return Winner.winnerX;
		}
		else if(numO == getSize()){
			return Winner.winnerO;
		}
		else{
			return Winner.NONE;
		}
	}

	/**
     * @return: true if there is no winner and letters in every cell
     */
	public boolean isDraw(){
		int count = 0; 
		for(int i = 0; i < getSize(); i++){
			for(int j = 0; j < getSize(); j++){
				if(board[i][j].getSign() == 'X' || board[i][j].getSign() == 'O'){
					count++;
				}
			}
		}

		if(count == getSize()*getSize()){
			return true;
		}

		return false;
	}

	public void main(String[] args){
		
	}
}
