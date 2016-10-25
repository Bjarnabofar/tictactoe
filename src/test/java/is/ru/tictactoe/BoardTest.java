package is.ru.tictactoe;

import static org.junit.Assert.*;
import is.ru.tictactoe.Board;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class BoardTest{

	//Stub class for Point
	public class StubPoint extends Point{

		public boolean isAvailable(){
			return true;
		}
	}

	@Test
	public void testSize(){
		Board board = new Board();
		assertEquals(3, board.getSize());
	}

	@Test
	public void testWhenCellInBoardIsAvailable(){

		Board board = new Board();
		assertTrue(board.isAvailable(new StubPoint()));
	}

}