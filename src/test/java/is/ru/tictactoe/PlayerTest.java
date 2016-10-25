package is.ru.tictactoe;

import static org.junit.Assert.*;
import is.ru.tictactoe.Player;

import org.junit.Test;

public class PlayerTest{

	@Test
	public void testGetWins(){
		Player p = new Player();
		assertEquals(0, p.getWins());
	}
}