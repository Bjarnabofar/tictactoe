
package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest{
	
	@Test
	public void testWelcome(){
		//TicTacToe t = new TicTacToe();
		assertEquals("Welcome to TicTacToe!", TicTacToe.welcome());
	}

	
}

