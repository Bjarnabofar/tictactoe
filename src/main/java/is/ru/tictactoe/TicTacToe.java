package is.ru.tictactoe;

public class TicTacToe{

	private int numberOfGames;
	private HumanPlayer human;
	private ComputerPlayer computer;
	private Board board;
	private Player playerWithLastTurn;

	public String welcome(){
		return ("Welcome to TicTacToe!");
	}

	public TicTacToe() {
		numberOfGames = 0;
		human = new HumanPlayer('X');
		computer = new ComputerPlayer('O');
	}

	public int getNumberOfGames() {
		return numberOfGames;
	}

	private void addGame() {
		numberOfGames++;
	}

	private boolean gameisOver() {
		if(board.hasWinner() || board.isDraw())
			return true;
		else
			return false;
	}

	public oneTurn() {
		playerWithLastTurn = human;
		do {
				Point pointHuman = human.getMove();
		}while(!isCellAvailable(pointHuman));
		putSign(pointHuman, human.getSign());

		if(!board.gameIsOver()) {
			do {
					playerWithLastTurn = computer;
					Point pointComputer = computer.getMove();
			}while(!isCellAvailable(pointComputer));
			putSign(pointComputer, computer.getSign());
		}
		board.displayBoard();
	}

	private oneRound() {
		do {
			oneTurn();
		}while(!gameIsOver());
		if(board.hasWinner) {
			if(human == playerWithLastTurn) {
				human.addWin();
				System.out.println("Congratulations you won!!");
			}
			else {
				computer.addWin();
				System.out.println("Sorry you lost, try again!");
			}
		}
		else {
			System.out.println("It's a tie!");
		}
		addGame();
		printScoreboard();
	}

	public playGame() {
		char answer;
		do {
			do {
				System.out.println("Do you want to play another TicTacToe? (y = yes) (n = no");
				answer = System.in.read();
			}while(answer != y && answer != n);
		}while(answer == y);
	}

	//public static void main(String[] args){
			//System.out.println(welcome());
	//}
}

