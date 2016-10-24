package is.ru.tictactoe;

public class Point {
	private int x;
	private int y;
	
	//default constructor, probably not used tho
	public Point(){
		x = 0;
		y = 0;
	}
	
	//another constructor takes x and y as parameters and 
	//constructs a point
	public Point(int xx, int yy){
		x = xx;
		y = yy;
	}

	//getter function for x
	public int getX(){
		return x;
	}
	
	//getter function for y
	public int getY(){
		return y;
	}

	//place holder main function
	public void main(String[] args){
		
	}
}
