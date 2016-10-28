
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
}

