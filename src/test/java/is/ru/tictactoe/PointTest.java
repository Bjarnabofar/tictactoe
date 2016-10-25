package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class PointTest{
	
	@Test
	public void testDefaultPointConstructor(){
		int xValue = 0, yValue = 0;
	
		Point p = new Point();
		assertEquals(xValue, p.getX());
		assertEquals(yValue, p.getY());
	}
	
	@Test
	public void testPointConstructor(){
		int xValue = 4, yValue = 1;
	
		Point p = new Point(xValue, yValue);
		assertEquals(xValue, p.getX());
		assertEquals(yValue	, p.getY());
	}
	
	@Test
	public void testPointSet(){
		int xValue = 2, yValue = 3;
		int changeX = 10, changeY = 1;
		
		Point p = new Point(xValue, yValue);
		p.setX(changeX);
		p.setY(changeY);
		assertEquals(changeX, p.getX());
		assertEquals(changeY, p.getY());
		
		
	}
	
}