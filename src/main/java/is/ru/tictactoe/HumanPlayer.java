package is.ru.tictactoe;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

/**
 * HumanPlayer class inherits from Player class, to get 
 * current move and the sign
 * @author Bjarnabofarnir
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
     * @return p which is the new Point that the user will be position on
     */
	public Point getMove() {
		int x = 0, y = 0;

		Scanner sc = new Scanner(System.in);

    	System.out.println("Enter the x-value: ");
		x = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the y-value: ");
		y = sc.nextInt();
		sc.nextLine();

		
		Point p = new Point(x, y);
		return p;	
	}
}

