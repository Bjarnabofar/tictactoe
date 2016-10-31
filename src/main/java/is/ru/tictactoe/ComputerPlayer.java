package is.ru.tictactoe;
import java.util.Random;

    /**
     * ComputerPlayer class inherits from Player class, to get 
     * current move (random) and the sign
     * @author Bjarnabofarnir
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
     * @return p which the new Point that the computer will be position on
     */
	public Point getMove() {
		Random rn = new Random();

		int x = rn.nextInt(3);
		int y = rn.nextInt(3);

		Point p = new Point(x, y);

		return p;
	}
}
