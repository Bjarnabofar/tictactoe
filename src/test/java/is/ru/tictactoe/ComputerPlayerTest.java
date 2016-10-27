package is.ru.tictactoe;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import is.ru.tictactoe.ComputerPlayer;
import is.ru.tictactoe.Point;

public class ComputerPlayerTest {
	@Test
	public void testRandomPoint() {
		ComputerPlayer cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int x = p.getX();
		int y = p.getY();

		assertTrue(x > lo &&  x < hi );
		assertTrue(y > lo &&  y < hi );

	}
}
