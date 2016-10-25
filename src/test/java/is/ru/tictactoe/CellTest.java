package is.ru.tictactoe;

import static org.junit.Assert.assertEquals;
import is.ru.tictactoe.Cell;

import org.junit.Test;

public class CellTest {

	@Test
	public void testSign(){
		Cell c = new Cell();
		assertEquals('.', c.getSign());
	}

}