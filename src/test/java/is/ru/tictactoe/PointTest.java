package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class PointTest{
	
	@Test
	public void testDefaultPointConstructor(){
		Point p = new Point();
		assertEquals(0, p.getX());
		assertEquals(1, p.getY());

	}
	
}