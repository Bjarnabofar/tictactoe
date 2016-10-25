package is.ru.tictactoe;

public class Point {

	private int x;
	private int y;

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

	public void setX(int xx){
		x = xx;
	}

	public void setY(int yy){
		y = yy;
	}

	public Point getPoint(){
		Point point = new Point(x, y);
		return point;
	}

}