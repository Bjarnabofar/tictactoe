package is.ru.tictactoe;
import is.ru.tictactoe.Board;


public class TicTacToe 
{

	private int numberOfGames;

	public static String welcome(){
		return ("Welcome to TicTacToe!");
	}

	public TicTacToe(){
		numberOfGames = 0;
	}

	public int getNumberOfGames(){
		return numberOfGames;
	}

	public static void main(String[] args){

		//Visual tests in console
		Board b = new Board();
		System.out.println(welcome());
		Point p = new Point(1,1);
		b.displayBoard();
		b.updateBoard(p, 'X');
		System.out.println();
		System.out.println();
		b.displayBoard();
	}
}

