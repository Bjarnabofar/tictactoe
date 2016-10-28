package is.ru.tictactoe;

public abstract class Player {
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
	public int getLosses() {
		return losses;
	}

	public int getDraws() {
		return draws;
	}

	public char getSign() {
		return sign;
	}
	public void addWin() {
		wins++;
	}

	public void addLoss() {
		losses++;
	}
	public void addDraw() {
		draws++;
	}

	protected abstract Point getMove();
}