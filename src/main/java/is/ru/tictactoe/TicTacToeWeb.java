package is.ru.tictactoe;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;
import java.util.HashMap;
import java.util.Map;

public class TicTacToeWeb implements SparkApplication{
	public static void main(String[] args) {
		staticFiles.location("/public");
		
		SparkApplication tttWeb = new TicTacToeWeb();
		//get("/", (req, res) -> ttt.welcome());
		String port = System.getenv("PORT");
		        if (port != null) {
				port(Integer.valueOf(port));
			}
		      tttWeb.init();
	}

	@Override
    public void init() {
    	final TicTacToe ttt = new TicTacToe();    
	    get("/welcome", (req, res) -> ttt.welcome());
	}
}
