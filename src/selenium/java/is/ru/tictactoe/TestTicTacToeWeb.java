package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.*;

//The Selenium test are unstable because they are testing towards random computer player
//If problems occur with the selenium tests please contact: thorhildurt15@ru.is
public class TestTicTacToeWeb extends SeleniumTestWrapper {

	@Test
    public void testInputX() throws  InterruptedException {
    
    	driver.get(baseUrl);

    	driver.findElement(By.id("restart")).click();
      	WebElement inputXIn11 = driver.findElement(By.id("board_11"));
      	inputXIn11.click();
      	Thread.sleep(3000);
		assertEquals("X", inputXIn11.getText());
		//driver.findElement(By.id("restart")).click();
    }

   /* @Test
    public void intitialMessageMatches() throws  InterruptedException {
        Thread.sleep(1000);
        driver.get(baseUrl);
        driver.findElement(By.id("restart")).click();

        int count = 0;

        //Check if all cells are empty
        for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
        		String the_id = "board_" + i + j;
    			WebElement inputX = driver.findElement(By.id(the_id));
    			if(inputX.getText().equals(".")){
    				count++;
    			}
        	}
        }

        if(count == 9){
        	//Thread.sleep(3000);
        	assertEquals("Waiting for some results...", driver.findElement(By.id("results")).getText());
        }
    }

    @Test
    public void testIfItIsTie() throws  InterruptedException {
    
    	driver.get(baseUrl);

    	String winnerIsX = "AND THE WINNER IS.... X!!!";
    	String winnerIsO = "AND THE WINNER IS.... O!!!";
    	String tie = "AND THE WINNER IS.... NOBODY!!!";

    	boolean isFinalResult = false;

    	for(int i = 0; i < 3; i++){
    		for(int j = 0; j < 3; j++){
    			String the_id = "board_" + i + j;
    			WebElement inputX = driver.findElement(By.id(the_id));
    			if(!inputX.getText().equals("X") && !inputX.getText().equals("O")) {
					inputX.click();
    			}
    		}
    	}

    	//wait for the ajax update of the text
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    	String results = driver.findElement(By.id("results")).getText();
		
		//Thread.sleep(3000);
		if(results.equals(winnerIsX) || results.equals(winnerIsO) || results.equals(tie)){
			isFinalResult = true;
		}

		assertTrue(isFinalResult);
    }

    @Test
    public void testRestart() throws  InterruptedException {
    	driver.get(baseUrl);

    	WebElement restart = driver.findElement(By.id("restart"));
      	restart.click();

      	boolean isRestart = false;
      	int count = 0;

      	for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
        		String the_id = "board_" + i + j;
    			WebElement inputX = driver.findElement(By.id(the_id));
    			if(inputX.getText().equals(".")){
    				count++;
    			}
        	}
        }

        if(count == 9){
        	isRestart = true;
        }

        //Thread.sleep(3000);
        assertTrue(isRestart);
    }*/
}