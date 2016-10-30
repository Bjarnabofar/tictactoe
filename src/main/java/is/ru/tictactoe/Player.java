package is.ru.tictactoe;

/**
 * Player class contains info of wins, losses and draws 
 * for a Player of the game Tic Tac Toe.
 * @author Bjarnabofarnir
 */
public abstract class Player {
	protected char sign;
	protected int wins;
	protected int losses;
	protected int draws;

	/**
     *@return wins which holds track of number of wins for this player
     */
	public int getWins() {
		return wins;
	}

	/**
     *@return losses which holds track of number of losses for this player
     */
	public int getLosses() {
		return losses;
	}

	/**
     *@return draws which holds track of number of draws for this player
     */
	public int getDraws() {
		return draws;
	}

	/**
     *@return sign which says if the player's sign is X or Y
     */
	public char getSign() {
		return sign;
	}

	/**
     * Increment number of wins by one
     */
	public void addWin() {
		wins++;
	}
	/**
     * Decrements number of losses by one
     */
	public void addLoss() {
		losses++;
	}

	/**
     * Increments number of draws by one
     */
	public void addDraw() {
		draws++;
	}

	/**
     * Gets the player's next move, implemented differently for computer player vs human player
     * @return the Point instance of the next move
     */
	protected abstract Point getMove();
}