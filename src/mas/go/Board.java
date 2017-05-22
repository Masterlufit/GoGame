package mas.go;

import java.util.HashMap;

public class Board {
	private String[][] board = new String[19][19];
	private String whoseTurn;

	private final String black = "black";
	private final String white = "white";

	private HashMap<Coordinates, String> history;

	public Board() {
		whoseTurn = black;
		history = new HashMap<>();
	}

	// Main next turn caller
	public void nextController(int x, int y, String type) {
		this.setPosition(x, y, type);
		this.addHistory(new Coordinates(x, y), type);
		this.nextTurn();
		System.out.println("Player " + type + " placed a piece at X:" + x + " Y:" + y);
	}

	// Position
	public void setPosition(int x, int y, String type) {
		this.board[x - 1][y - 1] = type;
	}

	// Get all positions on board
	public String[][] getBoard() {
		return this.board;
	}

	// Whose Turn?
	public void nextTurn() {
		if (this.whoseTurn.equals(black)) {
			this.whoseTurn = white;
		} else if (this.whoseTurn.equals(white)) {
			this.whoseTurn = black;
		} else {
			this.whoseTurn = black;
			System.err.println("[BUG] Board.nextTurn() found that Board.whoseTurn has incorrect value!");
		}
	}

	@Deprecated
	public void setTurn(String turn) {
		this.whoseTurn = turn;
	}

	public String getTurn() {
		return this.whoseTurn;
	}

	// History
	public void addHistory(Coordinates coods, String type) {
		history.put(coods, type);
	}

	public HashMap<Coordinates, String> getHistory() {
		return this.history;
	}
}
