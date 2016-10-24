package is.ru.tictactoe;

import static spark.Spark.*;

public class TicTacToeWeb {
	public static void main(String[] args) {
		TicTacToe ttt = new TicTacToe();
		get("/welcome", (req, res) -> ttt.welcome());
	}
}
