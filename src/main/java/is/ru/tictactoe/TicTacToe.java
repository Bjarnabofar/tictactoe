package is.ru.tictactoe;
import is.ru.tictactoe.Board;

<<<<<<< HEAD
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
=======
public class TicTacToe{

	private int numberOfGames;

	public String welcome(){
		return ("Welcome to TicTacToe!");
	}

	public TicTacToe() {
		numberOfGames = 0;
	}

	public int getNumberOfGames() {
		return numberOfGames;
>>>>>>> 08026aecc2e34b332bc9a40c98307038fe9067ff
	}
	//public static void main(String[] args){
			//System.out.println(welcome());
	//}
}

