package is.ru.tictactoe;

public class Point {

	private int x;
	private int y;
	
	//default constructor, probably not used tho

	public Point(){
		x = 0;
		y = 0;
	}

	//Constructor for new point
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	//getter function for x
	public int getX(){
		return x;
	}
	
	//getter function for y
	public int getY(){
		return y;
	}
	
	//setter function for x
	public void setX(int xx){
		x = xx;
	}
	
	//setter function for y
	public void setY(int yy){
		y = yy;
	}

	public Point getPoint(){
		Point point = new Point(x, y);
		return point;
	}

}


