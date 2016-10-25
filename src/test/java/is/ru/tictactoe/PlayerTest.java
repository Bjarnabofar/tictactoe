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

	@Test
	public void testGetLosses(){
		Player p = new Player();
		assertEquals(0, p.getLosses());
	}

	@Test
	public void testGetDraws(){
		Player p = new Player();
		assertEquals(0, p.getDraws());
	}

	@Test
	public void testGetSing(){
		Player p = new Player();
		assertEquals('X', p.getSign());
	}

	@Test
	public void testAddWins(){
		Player p = new Player();
		p.addWin();
		assertEquals(1, p.getWins());
	}

	@Test
	public void testAddLosses(){
		Player p = new Player();
		p.addLoss();
		assertEquals(1, p.getLosses());
	}

	@Test
	public void testAddDraw(){
		Player p = new Player();
		p.addDraw();
		assertEquals(1, p.getDraws());
	}
}