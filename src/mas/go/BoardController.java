package mas.go;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class BoardController {
	Board board;
	String black = "black";
	String white = "white";

	@FXML
	private Button grid1_1;

	/**
	 * Stuff
	 */
	@FXML
	private void initialize() {
		board = MainApp.gameBoard;
	}

	@FXML
	private void handle1_1() {
		if (board.getTurn().equals(black)) {
			board.setPosition(1, 1, black);
		} else {
			board.setPosition(1, 1, white);
		}
	}

	@FXML
	private void handle1_2() {
		if (board.getTurn().equals(black)) {
			board.setPosition(1, 2, black);
		} else {
			board.setPosition(1, 2, white);
		}
	}

}