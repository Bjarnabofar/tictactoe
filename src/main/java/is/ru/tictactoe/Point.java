package is.ru.tictactoe;

public class Point {

	protected int x;
	protected int y;

	//default constructor
	public Point(){
		x = 0;
		y = 0;
	}

	//Constructor for new point
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public Point getPoint(){
		Point point = new Point(x, y);
		return point;
	}

}