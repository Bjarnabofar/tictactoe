
package is.ru.tictactoe;
import is.ru.tictactoe.Board;

public class TicTacToe 
{
	public static String welcome(){
		return ("Welcome to TicTacToe!");
	}

	//test for visual things
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

