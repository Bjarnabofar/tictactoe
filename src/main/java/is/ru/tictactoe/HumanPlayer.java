package is.ru.tictactoe;
import java.io.IOException;

/**
 * @author: Bjarnabofarnir
 * HumanPlayer class inherits from Player class, to get 
 * current move and the sign
 */
public class HumanPlayer extends Player {
	/**
     * Sets the default sign for human player as X
     */
	public HumanPlayer () {
		sign = 'X';
	}

	/**
     * reads in the desired position (x,y)
     * @return: the new Point that the user will be position on
     */
	public Point getMove() {
		int x = 0, y = 0;

		try {
        	System.out.println("Enter the x-value: ");
			x = System.in.read();
			System.out.println("Enter the y-value: ");
			y = System.in.read();
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
		
		Point p = new Point(x, y);
		return p;	
	}
}

