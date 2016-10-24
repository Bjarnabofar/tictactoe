package is.ru.tictactoe;

public class Point {

	private int x;
	private int y;

	//default constructor
	public Point(){
		x = 0;
		y = 0;
	}

	public Point(int xx, int yy){
		x = xx;
		y = yy;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

}