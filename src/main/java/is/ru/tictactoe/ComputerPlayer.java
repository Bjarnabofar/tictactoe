package is.ru.tictactoe;
import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer {

	public Point getMove() {

		int x = ThreadLocalRandom.current().nextInt(3);
		int y = ThreadLocalRandom.current().nextInt(3);

		Point p = new Point(x, y);

		return p;
	}
}
