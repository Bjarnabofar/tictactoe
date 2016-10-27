package is.ru.tictactoe;

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
	}
	//public static void main(String[] args){
			//System.out.println(welcome());
	//}
}

