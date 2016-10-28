package is.ru.tictactoe;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.Board;
import is.ru.tictactoe.Player;
import is.ru.tictactoe.HumanPlayer;
import is.ru.tictactoe.ComputerPlayer;
import java.io.IOException;
import java.util.*;

public class TicTacToe
{

	private int numberOfGames;
	private HumanPlayer human;
	private ComputerPlayer computer;
	private Board board;
	private char lastTurn;

	public static String welcome(){
		return ("Welcome to TicTacToe!");
	}

	public TicTacToe(){
		numberOfGames = 0;
		human = new HumanPlayer();
		computer = new ComputerPlayer();
		board = new Board();
	}

	public int getNumberOfGames(){
		return numberOfGames;
	}

	public void addGame() {
		numberOfGames++;
	}

	private boolean gameIsOver() {
		if(board.hasWinner() || board.isDraw())
			return true;
		else
			return false;
	}

	private void printScoreboard() {
		int ties = getNumberOfGames()- human.getWins()- computer.getWins();
		System.out.println("The score is: --- You: " + human.getWins() + " --- Computer: " + computer.getWins() + " --- Ties: " + ties);
	}

	public void oneTurn() {
		board.displayBoard();
		lastTurn = 'X';
		Point pointHuman;
		Point pointComputer;
		do {
				pointHuman = human.getMove();
		}while(!board.isAvailable(pointHuman));
		board.updateBoard(pointHuman, human.getSign());

		if(!gameIsOver()) {
			do {
					lastTurn = 'Y';
					pointComputer = computer.getMove();
			}while(!board.isAvailable(pointComputer));
			board.updateBoard(pointComputer, computer.getSign());
		}
		board.displayBoard();
	}

	private void oneRound() {
		board.displayBoard();
		do {
			oneTurn();
		}while(!gameIsOver());
		if(board.hasWinner()) {
			if(lastTurn == 'X') {
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

	public void playGame() {
		int answer = 1;
		
		try {
			do {
					System.out.println("Do you want to play another TicTacToe? (1 = yes) (2 = no)");
					answer = System.in.read();
				oneRound();
			}while(answer == 1);
		}catch (IOException e){
            System.out.println("Error reading from user");
        }
	
	}

	public static void main(String[] args){
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.playGame();
		return;
	}
}

