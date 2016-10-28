package is.ru.tictactoe;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class HumanPlayer extends Player {

	public HumanPlayer () {
		sign = 'X';
	}
	
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

