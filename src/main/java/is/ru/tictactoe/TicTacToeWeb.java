package is.ru.tictactoe;

import static spark.Spark.*;
import spark.*;

public class TicTacToeWeb {
	public static void main(String[] args) {
		port(getHerokuAssignedPort());
		staticFileLocation("/public");
		
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
	    post("/welcome", (req, res) -> ttt.welcome());
	    res.status(200);
	    return res;
	}
}
