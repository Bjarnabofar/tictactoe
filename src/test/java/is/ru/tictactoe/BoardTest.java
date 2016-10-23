package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Board;

import org.junit.Test;

public class BoardTest{
	
	@Test
	public void testWelcome(){
		Board b = new Board();
		assertEquals("Welcome to Board!", b.welcome());
	}

	@Test
	public void testSize(){
		Board b = new Board();
		assertEquals(3, b.getSize());
	}

	@Test
	public void testDisplayBoard(){
		
	}
}