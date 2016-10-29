package is.ru.tictactoe;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.Board;
import is.ru.tictactoe.Player;
import is.ru.tictactoe.HumanPlayer;
import is.ru.tictactoe.ComputerPlayer;
import java.io.IOException;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * The TicTacToe class is the brain of the application.
 * It contains the business logic behind the game by
 * connecting all the other classes together.
 * It runs the game.
 * @author: Bjarnabofarnir
 */

public class TicTacToe
{

	private int numberOfGames;
	private HumanPlayer human;
	private ComputerPlayer computer;
	private Board board;
	private char lastTurn;

	/**
	* @return: the 1d form of the given tile
	*/
	public int xyTo1d(Point p) {
		int size = board.getSize();
		return (size * p.getX()) + p.getY() + 1;
	}

	public void initBoard() {
		board.initBoard();
	}
	/**
     * Welcomes the user to the game!
     */
	public static String welcome() {
		String welcome = "Welcome to TicTacToe!";
		return welcome;
	}

	public boolean updateBoard(int x, int y, char move) {
		if (board.isAvailable(x, y)){
			board.updateBoard(x, y, move);
			return true;
		}
		return false;
	}

	/**
     * Constructor for the TicTacToe class
     */
	public TicTacToe(){
		numberOfGames = 0;
		human = new HumanPlayer();
		computer = new ComputerPlayer();
		board = new Board();
	}

	/**
     * @return: the variable numberOfGames, that keeps track of games played.
     */
	public int getNumberOfGames(){
		return numberOfGames;
	}
	/**
	 * Increases the number of games played.
	 */
	public void addGame() {
		numberOfGames++;
	}

	/**
     * @return: true if the game is over, false otherwise.
     */
	public boolean gameIsOver() {
		if(board.hasWinner() || board.isDraw())
			return true;
		else
			return false;
	}
	/**
     * Prints out the scoreboard, i.e. human player wins, computer player wins and ties.
     */
	private void printScoreboard() {
		int ties = getNumberOfGames()- human.getWins()- computer.getWins();
		System.out.println("The score is: --- You: " + human.getWins() + " --- Computer: " + computer.getWins() + " --- Ties: " + ties);
	}

	/**
     * Asks each player to make one move, and makes sure the move is legal.
     */
	public void oneTurn() {
		lastTurn = 'X';
		Point pointHuman;
		Point pointComputer;
		board.displayBoard();
		do {
			pointHuman = human.getMove();
		}while(!board.isAvailable(pointHuman));
		board.updateBoard(pointHuman, human.getSign());

		if(!gameIsOver()) {
			board.displayBoard();
			System.out.println("Computer is creating a masterplan to beat you...");
			do {
				lastTurn = 'O';
				pointComputer = computer.getMove();
			}while(!board.isAvailable(pointComputer));
			board.updateBoard(pointComputer, computer.getSign());
		}
	}

	public Point computerMove() {
		Point pointComputer;
		do {
			pointComputer = computer.getMove();
		}while(!board.isAvailable(pointComputer));
		board.updateBoard(pointComputer, computer.getSign());
		return pointComputer;
	}
	/**
     * Playes one whole round of tictactoe. One round is classified as one game of TicTacToe.
     */

	public boolean hasWinner() {
		return board.hasWinner();
	}

	public char getWinner() {
		return board.getWinner();
	}

	private void oneRound() {
		do {
			oneTurn();
		}while(!gameIsOver());
		board.displayBoard();
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
	/**
     * @return: the game board
     */
	public Board getBoard() {
		return board;
	}

	public void playGame() {
		Scanner sc = new Scanner(System.in);
		int answer = 1;
		do {
			oneRound();
			System.out.println("Do you want to play another TicTacToe? (1 = yes) (2 = no)");
			answer = sc.nextInt();
			sc.nextLine();
			board.initBoard();

		} while(answer == 1);
	}

	public static void main(String[] args){
		TicTacToe tictactoe = new TicTacToe();
		tictactoe.playGame();
		return;
	}
}

