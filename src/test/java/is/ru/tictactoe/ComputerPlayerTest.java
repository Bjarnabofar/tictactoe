package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.Test;
import is.ru.tictactoe.Point;
import is.ru.tictactoe.ComputerPlayer;


public class ComputerPlayerTest {

	public class StubNotRandom extends Random{
        int sequentialNum = 0;

        public StubNotRandom(){
            super();
        }

        public int nextInt(){
            return sequentialNum++;
        }
    }
	
	public class StubCpPlayer extends Player {
		public StubCpPlayer getMove() {
			StubNotRandom rn = new StubNotRandom();
			
			int x = rn.nextint();
			int y = rn.nextint();
		
			Point p = new Point(x, y);
			return p;
		}
	}
	
	

	@Test
	public void testGetSing(){
		Player p = new ComputerPlayer();
		assertEquals('O', p.getSign());
	}
	

	@Test
	public void testRandomPointX() {
		Player cp = new StubCpPlayer();
		Point p = cp.getMove();
		
		int xValue = 0;
		
		assertEquals(xValue, p.getX());
		
	}

	@Test
	public void testRandomPointy() {
		Player cp = new StubCpPlayer();
		Point p = cp.getMove();
		
		int yValue = 1;
		
		assertEquals(yValue, p.getY());
		
	}
}
