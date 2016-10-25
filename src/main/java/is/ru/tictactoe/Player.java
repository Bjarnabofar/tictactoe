package is.ru.tictactoe;

public class Player {
	private char sign;
	private int wins;
	private int losses;
	private int draws;

	public Player () {
		sign = 'X';
	}

	public int getWins() {
		return wins;
	}
}