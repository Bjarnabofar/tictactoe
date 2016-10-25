package is.ru.tictactoe;

import java.util.*;
import is.ru.tictactoe.Cell;
import is.ru.tictactoe.Point;

public class Board
{
	private int size;
	private Cell[][] board;

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
				System.out.print(board[y][x].getSign() + " ");
			}
			System.out.println();
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


	public void main(String[] args){
		
	}
}
