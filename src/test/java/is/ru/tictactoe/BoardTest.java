package is.ru.tictactoe;

import static org.junit.Assert.*;
import is.ru.tictactoe.Board;
import is.ru.tictactoe.Point;

import org.junit.Test;

public class BoardTest{

	Board board = new Board();

	//Stub class for Point
	public class StubPoint extends Point{
		public StubPoint(int x, int y){
			setX(x);
			setY(y);
		}
	}

	@Test
	public void testSize(){
		assertEquals(3, board.getSize());
	}

	@Test
	public void testWhenCellInBoardIsAvailable(){
		assertTrue(board.isAvailable(new StubPoint(1,1)));
	}

	@Test
	public void testWhenCellIsUpdatedByX(){
		StubPoint s = new StubPoint(1,1);
		board.updateBoard(s,'X');
		assertFalse(board.isAvailable(s));
	}

	@Test
	public void testWhenCellIsUpdatedByO(){
		StubPoint s = new StubPoint(1,1);
		board.updateBoard(s,'O');
		assertFalse(board.isAvailable(s));
	}

	@Test
	public void testHasWinner(){
		assertFalse(board.hasWinner());
	}

	@Test
	public void testIfXIsWinnerInRow1(){
		StubPoint a = new StubPoint(0,0);
		StubPoint b = new StubPoint(0,1);
		StubPoint c = new StubPoint(0,2);

		board.updateBoard(a, 'X');
		board.updateBoard(b, 'X');
		board.updateBoard(c, 'X');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfOIsWinnerInRow2(){
		StubPoint a = new StubPoint(1,0);
		StubPoint b = new StubPoint(1,1);
		StubPoint c = new StubPoint(1,2);

		board.updateBoard(a, 'O');
		board.updateBoard(b, 'O');
		board.updateBoard(c, 'O');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfXIsWinnerInRow3(){
		StubPoint a = new StubPoint(2,0);
		StubPoint b = new StubPoint(2,1);
		StubPoint c = new StubPoint(2,2);
		
		board.updateBoard(a, 'O');
		board.updateBoard(b, 'O');
		board.updateBoard(c, 'O');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfXIsWinnerInCol1(){
		StubPoint a = new StubPoint(0,0);
		StubPoint b = new StubPoint(1,0);
		StubPoint c = new StubPoint(2,0);

		board.updateBoard(a, 'X');
		board.updateBoard(b, 'X');
		board.updateBoard(c, 'X');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfOIsWinnerInCol2(){
		StubPoint a = new StubPoint(0,1);
		StubPoint b = new StubPoint(1,1);
		StubPoint c = new StubPoint(2,1);

		board.updateBoard(a, 'O');
		board.updateBoard(b, 'O');
		board.updateBoard(c, 'O');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfOIsWinnerInCol3(){
		StubPoint a = new StubPoint(0,2);
		StubPoint b = new StubPoint(1,2);
		StubPoint c = new StubPoint(2,2);

		board.updateBoard(a, 'O');
		board.updateBoard(b, 'O');
		board.updateBoard(c, 'O');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfOIsWinnerDiagonallyTopLeftToRightBottom(){
		StubPoint a = new StubPoint(0,0);
		StubPoint b = new StubPoint(1,1);
		StubPoint c = new StubPoint(2,2);

		board.updateBoard(a, 'O');
		board.updateBoard(b, 'O');
		board.updateBoard(c, 'O');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfXIsWinnerDiagonallyTopRightToLeftBottom(){
		StubPoint a = new StubPoint(0,2);
		StubPoint b = new StubPoint(1,1);
		StubPoint c = new StubPoint(2,0);

		board.updateBoard(a, 'X');
		board.updateBoard(b, 'X');
		board.updateBoard(c, 'X');
		assertTrue(board.hasWinner());
	}

	@Test
	public void testIfItIsDraw(){
		StubPoint a = new StubPoint(0,0);
		StubPoint b = new StubPoint(0,1);
		StubPoint c = new StubPoint(0,2);
		StubPoint d = new StubPoint(1,0);
		StubPoint e = new StubPoint(1,1);
		StubPoint f = new StubPoint(1,2);
		StubPoint g = new StubPoint(2,0);
		StubPoint h = new StubPoint(2,1);
		StubPoint i = new StubPoint(2,2);

		board.updateBoard(a, 'O');
		board.updateBoard(b, 'X');
		board.updateBoard(c, 'X');
		board.updateBoard(d, 'X');
		board.updateBoard(e, 'O');
		board.updateBoard(f, 'O');
		board.updateBoard(g, 'X');
		board.updateBoard(h, 'O');
		board.updateBoard(i, 'X');

		assertTrue(board.isDraw());
	}

	@Test 
	public void testWhenThereIsNoDraw(){
		assertFalse(board.isDraw());
	}






}