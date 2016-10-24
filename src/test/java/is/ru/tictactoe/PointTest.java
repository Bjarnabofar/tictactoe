package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class PointTest {

	Point p = new Point();

	@Test
	public void testX(){
		Point np = new Point(2, 2);
		assertEquals(2, np.getX());
	}

	@Test
	public void testY(){
		Point np = new Point(2, 1);
		assertEquals(1, np.getY());
	}


}