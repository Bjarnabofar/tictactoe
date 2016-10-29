
package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Point;
import org.junit.Test;

public class TicTacToeTest{

	public class StubPoint extends Point{
		public StubPoint(int x, int y){
			setX(x);
			setY(y);
		}
	}
	
	@Test
	public void testWelcome(){
		assertEquals("Welcome to TicTacToe!", TicTacToe.welcome());
	}

	@Test
	public void testGetNumberOfGamesZero(){
		TicTacToe t = new TicTacToe();
		assertEquals(0, t.getNumberOfGames());
	}

	@Test
	public void testGetNumberOfGamesMany(){
		TicTacToe t = new TicTacToe();
		t.addGame();
		t.addGame();
		t.addGame();
		t.addGame();
		assertEquals(4, t.getNumberOfGames());
	}

	@Test
	public void testxyTo1d(){
		StubPoint sp = new StubPoint(0,0);
		TicTacToe t = new TicTacToe();
		assertEquals(1, t.xyTo1d(sp));
	}
}

