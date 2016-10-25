package is.ru.tictactoe;

import static org.junit.Assert.*;
import is.ru.tictactoe.Board;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class BoardTest{

	Board board = new Board();

	//Stub class for Point
	public class StubPoint extends Point{
		public StubPoint(){

		}

		public StubPoint(int xx, int yy){ 
			x = xx;
			y = yy;
		}

	}

	@Test
	public void testSize(){
		assertEquals(3, board.getSize());
	}

	@Test
	public void testWhenCellInBoardIsAvailable(){
		assertTrue(board.isAvailable(new StubPoint()));
	}

	@Test
	public void testWhenCellIsUpdatedByX(){
		StubPoint s = new StubPoint(1, 1);
		board.updateBoard(s,'X');
		assertFalse(board.isAvailable(s));
	}

	@Test
	public void testWhenCellIsUpdatedByO(){
		StubPoint s = new StubPoint(1, 1);
		board.updateBoard(s,'O');
		assertFalse(board.isAvailable(s));
	}
}