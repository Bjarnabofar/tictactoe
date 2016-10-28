package is.ru.tictactoe;

/**
 * The Cell class gets and returns the char values for the sign in each cell. 
 * @author: Bjarnabofarnir
 */

public class Cell {

	private char sign;

	public static final char defaultChar = '.';

	/**
     * initialize the sign in cell with the sign '.'
     */
	public Cell(){
		sign = defaultChar;
	}

	/**
     * @return: return the sign in the cell
     */
	public char getSign(){
		return sign;
	}

	/**
     * @param: assigns the char m to sign in the cell
     */
	public void setSign(char m){
		sign = m;
	}

	public void main(String[] args){
		
	}
}