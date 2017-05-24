package mas.go;

import java.util.HashMap;

import mas.go.util.Location;
import mas.go.util.Logger;
import mas.go.util.Position;
import mas.go.util.Stone;
import sun.nio.cs.Surrogate;

public class Board {
	private Stone[][] board = new Stone[19][19];
	private String whoseTurn;

	private final String black = "black", white = "white";

	private HashMap<Location, Stone> history;

	private Logger logger;

	public Board() {
		whoseTurn = "black";
		history = new HashMap<>();
		logger = new Logger();

		logger.info("Game Starts");
	}

	// Main next turn caller
	public void nextController(int x, int y, String type) {
		if (this.getPieceFromPosition(x, y) == null) {
			// TODO: Check Rules!!
			// Self Capture Rule
			Stone piece = Stone.valueOf(type.toUpperCase());

			// Legal Move
			this.setPosition(x, y, type);
			// Log history only if legal
			this.addHistory(new Location(x, y), Stone.valueOf(type.toUpperCase()));
			// Next turn for player
			this.nextTurn();

			logger.gameplay("Player " + type + " placed a piece at X:" + x + " Y:" + y);
		} else {
			// Disable placing onto another piece
			logger.illegal("Player " + type + " tried to place a piece at X:" + x + " Y:" + y + " when a "
					+ this.getPieceFromPosition(x, y).toString().toLowerCase() + " piece exists");
		}
	}

	// Position
	public void setPosition(int x, int y, String type) {
		this.board[x - 1][y - 1] = Stone.valueOf(type.toUpperCase());
	}

	public Stone getPieceFromPosition(int x, int y) {
		if (this.board[x - 1][y - 1] == null) {
			return null;
		} else {
			return this.board[x - 1][y - 1];
		}
	}

	// Get all positions on board
	public Stone[][] getBoard() {
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
			logger.error("String \"Board.whoseTurn\" has incorrect value!");
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
	public void addHistory(Location coods, Stone type) {
		history.put(coods, type);
	}

	public HashMap<Location, Stone> getHistory() {
		return this.history;
	}

	// Get surrounding pieces
	public HashMap<Position, Stone> getSurroundings(Location loc) {
		HashMap<Position, Stone> surroundings = new HashMap<>();
		int x = loc.getX(), y = loc.getY();
		// Up
		y++;
		surroundings.put(Position.UP, this.getPieceFromPosition(x, y));
		y--;
		// Down
		y--;
		surroundings.put(Position.DOWN, this.getPieceFromPosition(x, y));
		y++;
		// Left
		x--;
		surroundings.put(Position.LEFT, this.getPieceFromPosition(x, y));
		x++;
		// Right
		x++;
		surroundings.put(Position.RIGHT, this.getPieceFromPosition(x, y));
		x--;
		return surroundings;
	}

	// Check Self Capture
	public void onCheck(Location loc, Stone s) {
		HashMap<Position, Stone> surroundings = this.getSurroundings(loc);

		for (Position pos : surroundings.keySet()) {
			
		}
	}
}
