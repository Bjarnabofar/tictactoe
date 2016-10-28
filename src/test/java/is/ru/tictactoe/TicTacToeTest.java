
package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	
	@Test
	public void testWelcome(){
		assertEquals("Welcome to TicTacToe!", TicTacToe.welcome());
	}

	@Test
	public void testGetNumberOfGames(){
		TicTacToe t = new TicTacToe();
		assertEquals(0, t.getNumberOfGames());
	}

}

