package is.ru.tictactoe;

import java.io.IOException;

public class HumanPlayer extends Player {

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

