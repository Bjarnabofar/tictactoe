package is.ru.tictactoe;

/**
 * The Point class contains information about the position
 * of X and Y for the board
 * @author Bjarnabofarnir
 */
public class Point {

	private int x;
	private int y;
	
	/**
     * default constructor
     */
	public Point(){
		x = 0;
		y = 0;
	}

	/**
     * Constructor for new point
     * @param x is for the x value
     * @param y is for the y value
     */
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	/**
     * @return the value of x
     */	
	public int getX(){
		return x;
	}
	
	/**
     * @return the value of y
     */	
	public int getY(){
		return y;
	}
	
	/**
     * Constructor for new point
     * @param xx is new value for x
     */
	public void setX(int xx){
		x = xx;
	}
	
	/**
     * Constructor for new point
     * @param yy is new value for y
     */
	public void setY(int yy){
		y = yy;
	}

	/**
     * @return point of (x, y) coordinates
     */
	public Point getPoint(){
		Point point = new Point(x, y);
		return point;
	}

}


