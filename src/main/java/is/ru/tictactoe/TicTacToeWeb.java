package is.ru.tictactoe;

import static spark.Spark.*;
import spark.*;
import spark.servlet.SparkApplication;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

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
    	Gson gson = new Gson();
	    get("/welcome", (req, res) -> ttt.welcome());
	    get("/getBoard", (req, res) -> ttt.getBoard(), gson::toJson);

	    post("/humanMove", (req, res) -> {
            boolean test = ttt.updateBoard(
                Integer.parseInt(req.queryParams("x")),
                Integer.parseInt(req.queryParams("y")),
                req.queryParams("move").charAt(0)
            );          
            res.status(200);
            return test;
        });

        get("/computerMove", (req, res) -> ttt.computerMove());
	}
}
