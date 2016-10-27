package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.ComputerPlayer;


public class ComputerPlayerTest {
	@Test
	public void testRandomPointX() {
		ComputerPlayer cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int x = p.getX();

		assertTrue(x > lo && x < hi);
	}

	@Test
	public void testRandomPointY() {
		ComputerPlayer cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int y = p.getY();

		assertTrue(y > lo && y < hi);
	}
}
