package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import java.util.*;

//The Selenium test are fragile because they are testing towards random computer player
public class TestTicTacToeWeb extends SeleniumTestWrapper {

    @Test
    public void testRestart() throws  InterruptedException {
        boolean isRestart = false;
        int count = 0;

        driver.get(baseUrl);
        driver.findElement(By.id("restart")).click();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                String the_id = "board_" + i + j;

                Thread.sleep(1000);
                if(driver.findElement(By.id(the_id)).getText().equals(".")){
                    count++;
                }
            }
        }

        if(count == 9){
            isRestart = true;
        }

        assertTrue(isRestart);
    }

    @Test
    public void intitialMessageMatches() throws  InterruptedException {


        //Thread.sleep(1000);
        driver.get(baseUrl);

        //need to restart TODO: fix bug
        driver.findElement(By.id("restart")).click();

        assertEquals("Waiting for results...", driver.findElement(By.id("results")).getText());
        

    }

    @Test
    public void testInputX() throws  InterruptedException {
    
        driver.get(baseUrl);

        //need to restart TODO: fix bug
        driver.findElement(By.id("restart")).click();
        WebElement inputXIn11 = driver.findElement(By.id("board_11"));
        inputXIn11.click();

        Thread.sleep(3000);
        assertEquals("X", inputXIn11.getText());
        driver.findElement(By.id("restart")).click();
    }

}