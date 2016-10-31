package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.ComputerPlayer;


public class ComputerPlayerTest {

	@Test
	public void testGetSing(){
		Player p = new ComputerPlayer();
		assertEquals('O', p.getSign());
	}
	

/*
	@Test
	public void testRandomPointY() {
		Player cp = new ComputerPlayer();
		Point p = cp.getMove();
		
		int low = 0;
		int high = 3;
		boolean check = false;

		if(p.getY() < 3 && p.getY() > 0) {
			check = true;
		}
			
		assertEquals(check, true);		
	}
*/

/*
	@Test
	public void testRandomPointX() {
		Player cp = new ComputerPlayer();
		Point p = cp.getMove();	
		
		int low = 0;
		int high = 3;
		boolean check = false;

		if(p.getX() < 3 && p.getX() > 0) {
			check = true;
		}
			
		assertEquals(check, true);
	}
	*/
}
