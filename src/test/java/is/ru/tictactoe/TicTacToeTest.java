
package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	
	@Test
	public void testWelcome(){
		TicTacToe t = new TicTacToe();
		assertEquals("Welcome to TicTacToe!", t.welcome());
	}

	@Test
	public void testGetNumberOfGames(){
		TicTacToe t = new TicTacToe();
		assertEquals(0, t.getNumberOfGames());
	}
}

