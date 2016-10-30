package is.ru.tictactoe;

import org.openqa.selenium.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
//import static org.openqa.selenium.support.ui.ExpectedConditions.*;
 
public class TestTicTacToeWeb extends SeleniumTestWrapper {

    @Test
    public void titleMatches() throws  InterruptedException {
        Thread.sleep(5000);
        driver.get(baseUrl);
        Thread.sleep(5000);
        assertEquals("Waiting for some results...", driver.findElement(By.id("results")).getText());
    }


    @Test
    public void testInputX() {
    
    	driver.get(baseUrl);

      	WebElement inputXIn11 = driver.findElement(By.id("board_11"));
      	inputXIn11.click();
		assertEquals("X", inputXIn11.getText());
    }


}