package is.ru.tictactoe;
import java.util.concurrent.ThreadLocalRandom;

    /**
     * @author: Bjarnabofarnir
     * ComputerPlayer class inherits from Player class, to get 
     * current move (random) and the sign
     */
public class ComputerPlayer extends Player{

	/**
     * Sets the default sign for computer player as O
     */
	public ComputerPlayer () {
		sign = 'O';
	}

	/**
     * generates a random position (x,y) for user
     * @return: the new Point that the computer will be position on
     */
	public Point getMove() {

		int x = ThreadLocalRandom.current().nextInt(3);
		int y = ThreadLocalRandom.current().nextInt(3);

		Point p = new Point(x, y);

		return p;
	}
}
