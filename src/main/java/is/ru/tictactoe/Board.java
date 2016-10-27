package is.ru.tictactoe;

import java.util.*;
import is.ru.tictactoe.Cell;
import is.ru.tictactoe.Point;

public class Board
{
	private int size;
	private Cell[][] board;

	public enum Winner {
		winnerX,
		winnerO,
		NONE
	}

	//default constructor initialize tictactoe board with size 3
	public Board()
	{
		size = 3;
		board = new Cell[size][size];
		initBoard();

	}

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
	}

	public boolean isAvailable(Point p){
		if(board[p.getX()][p.getY()].getSign() == 'X' || board[p.getX()][p.getY()].getSign() == 'O'){
			return false;
		}
		return true;
	}

	public void updateBoard(Point p, char move){
		if(isAvailable(p)){
			board[p.getX()][p.getY()].setSign(move);
		}
	}

	public Cell getCellAtPoint(Point p){
		return board[p.getX()][p.getY()];
	}

	public boolean hasWinner(){

		if(checkRows() != Winner.NONE){
			return true;
		}
		else if (checkColumns() != Winner.NONE){
			return true;
		}

		return false;
	}

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
				if(countX == getSize() || countO == getSize())
				{
					return getWinner(countX, countO);
				}
			}
			countX = 0;
			countO = 0;
		}

		return Winner.NONE;
	}

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
				if(countX == getSize() || countO == getSize())
				{
					return getWinner(countX, countO);
				}
			}
			countX = 0;
			countO = 0;
		}
		
		return Winner.NONE;
	}

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

	public boolean checkDiagonals(){
		return true;
	}


	public void main(String[] args){
		
	}
}
