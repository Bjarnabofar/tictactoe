package is.ru.tictactoe;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import is.ru.tictactoe.ComputerPlayer;
import is.ru.tictactoe.Point;

public class ComputerPlayerTest {
	@Test
	public void testRandomPointX() {
		ComputerPlayer cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int x = p.getX();

		assertTrue("error invalid value: " + x, x > lo && x < hi);
	}

	@Test
	public void testRandomPointY() {
		ComputerPlayer cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int y = p.getY();

		assertTrue("error invalid value: " + y, y > lo && y < hi);
	}
}
