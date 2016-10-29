package is.ru.tictactoe;
import java.util.*;

public class ComputerPlayer extends Player{

	public ComputerPlayer () {
		sign = 'O';
	}

	public Point getMove() {
		Random rn = new Random();

		int x = rn.nextInt(3);
		int y = rn.nextInt(3);

		Point p = new Point(x, y);

		return p;
	}
}
