package is.ru.tictactoe;

import java.util.*;
import is.ru.tictactoe.Cell;

public class Board
{
	private int size;
	private Cell[][] cells;

	//default constructor initialize tictactoe board with size 3
	public Board()
	{
		size = 3;
		cells = new Cell[size][size];
		initBoard();

	}

	public void initBoard(){
		for(int y = 0; y < getSize(); y++)
		{
			for(int x = 0; x < getSize(); x++)
			{
				cells[y][x] = new Cell();
			}
		}
	}

	public int getSize(){
		return size;
	}

	public void displayBoard(){
		for(int y = 0; y < getSize(); y++)
		{
			for(int x = 0; x < getSize(); x++)
			{
				System.out.print(cells[y][x].getSign() + " ");
			}
			System.out.println();
		}
	}

	public boolean isAvailable(Cell cell)
	{

	}


	public void main(String[] args){
		
	}
}
