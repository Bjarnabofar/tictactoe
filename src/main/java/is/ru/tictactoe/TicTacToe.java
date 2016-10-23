
package is.ru.tictactoe;
import is.ru.tictactoe.Board;

public class TicTacToe 
{
	public static String welcome(){
		return ("Welcome to TicTacToe!");
	}

	public static void main(String[] args){
		Board b = new Board();
		System.out.println(welcome());
		b.displayBoard();
	}
}

