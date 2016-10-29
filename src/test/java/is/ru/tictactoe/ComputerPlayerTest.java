package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.ComputerPlayer;


public class ComputerPlayerTest {

	@Test
	public void testGetSing(){
		Player p = new ComputerPlayer();
		assertEquals('O', p.getSign());
	}

	/*@Test
	public void testRandomPointX() {
		Player cp = new ComputerPlayer();
		Point p = cp.getMove();
		int lo = 0;
		int hi = 3;
		int x = p.getX();

		assertTrue(x > lo && x < hi);
	}

	@Test
	public void testRandomPointY() {
		Player cp = new ComputerPlayer();
		Point p = cp.getMove();

		int lo = 0;
		int hi = 3;
		int y = p.getY();

		assertTrue(y > lo && y < hi);
	}*/
}
