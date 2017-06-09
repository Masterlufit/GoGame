package mas.go;

import java.util.HashMap;

import mas.go.util.Location;
import mas.go.util.Logger;
import mas.go.util.Position;
import mas.go.util.Stone;

public class Board {
	private Stone[][] board = new Stone[19][19];
	private String whoseTurn;

	private final String black = "black", white = "white";
	private final boolean debug = true;

	private HashMap<Location, Stone> history;

	private Logger logger;

	public Board() {
		whoseTurn = "black";
		history = new HashMap<>();
		logger = new Logger();

		logger.info("Game Starts");
	}

	// Main next turn controller
	public boolean nextController(int x, int y, String type) {
		x--;
		y--;
		if (this.getPieceFromPosition(x, y) == Stone.EMPTY) {
			// TODO: Check Rules!!
			// Self Capture Rule
			Stone piece = Stone.valueOf(type.toUpperCase());

			if (this.isSelfCapture(piece, new Location(x, y), Position.NULL)) {
				// Disable Self Capture
				logger.illegal("Player " + type + " tried to place a piece at X:" + x + " Y:" + y
						+ " when it is self capture!");
				return false;
			}

			// Legal Move
			this.setPosition(x, y, type);
			// Log history only if legal
			this.addHistory(new Location(x, y), piece);
			// Next turn for player
			this.nextTurn();

			logger.gameplay("Player " + type + " placed a piece at X:" + x + " Y:" + y);

			// Prints the Board if debug mode is on
			if (!debug)
				for (int xx = 0; xx < this.getBoard().length; xx++) {
					for (int yy = 0; yy < this.getBoard()[0].length; yy++) {
						System.out.print(this.getBoard()[xx][yy] + " ");
					}
					System.out.println();
				}

			return true;
		} else {
			// Disable placing onto another piece
			logger.illegal("Player " + type + " tried to place a piece at X:" + x + " Y:" + y + " when a "
					+ this.getPieceFromPosition(x, y).toString().toLowerCase() + " piece exists");
			return false;
		}
	}

	// Position
	public void setPosition(int x, int y, String type) {
		this.board[x][y] = Stone.getValue(type.toUpperCase());
	}

	public Stone getPieceFromPosition(int x, int y) {
		if (x < 0 || x > 18 || y < 0 || y > 18) {
			return Stone.BOARDER;
		}

		if (this.board[x][y] == null) {
			return Stone.EMPTY;
		} else {
			return this.board[x][y];
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

	public boolean isSelfCapture(Stone stone, Location loc, Position from) {
		boolean up = false, down = false, left = false, right = false;

		// Check from position condition
		if (from != Position.NULL) {
			if (from == Position.UP)
				up = true;
			else if (from == Position.DOWN)
				down = true;
			else if (from == Position.LEFT)
				left = true;
			else if (from == Position.RIGHT)
				right = true;
		}

		/**
		 * Check surrounding pieces
		 */
		int x = loc.getX();
		int y = loc.getY();

		// +x (right)
		if (right != true)
			if (x + 1 > 18) {
				right = true;
			} else {
				Stone test = this.getPieceFromPosition(x, y + 1);
				if (debug)
					System.out.println("Right > Original: " + stone + " Test: " + test);
				if (test == stone) {
					// Recursive Test
					if (isSelfCapture(test, new Location(x + 1, y), Position.RIGHT)) {
						right = true;
					}
					if (debug)
						System.err.println("Recursive");
				} else if (test == Stone.EMPTY) {
					right = false;
				} else {
					right = true;
				}
			}

		// -x (left)
		if (left != true)
			if (x - 1 < 0) {
				left = true;
			} else {
				Stone test = this.getPieceFromPosition(x, y - 1);
				if (debug)
					System.out.println("Left > Original: " + stone + " Test: " + test);
				if (test == stone) {
					// Recursive Test
					if (isSelfCapture(test, new Location(x - 1, y), Position.LEFT)) {
						left = true;
					}
					if (debug)
						System.err.println("Recursive");
				} else if (test == Stone.EMPTY) {
					left = false;
				} else {
					left = true;
				}
			}

		// +y (up)
		if (up != true)
			if (x + 1 > 18) {
				up = true;
			} else {
				Stone test = this.getPieceFromPosition(x + 1, y);
				if (debug)
					System.out.println("Up > Original: " + stone + " Test: " + test);
				if (test == stone) {
					// Recursive Test
					if (isSelfCapture(test, new Location(x, y + 1), Position.UP)) {
						up = true;
					}
					if (debug)
						System.err.println("Recursive");
				} else if (test == Stone.EMPTY) {
					up = false;
				} else {
					up = true;
				}
			}

		// -y (down)
		if (down != true)
			if (y - 1 < 0) {
				down = true;
			} else {
				Stone test = this.getPieceFromPosition(x - 1, y);
				if (debug)
					System.out.println("Down > Original: " + stone + " Test: " + test);
				if (test == stone) {
					// Recursive Test
					if (isSelfCapture(test, new Location(x, y - 1), Position.DOWN)) {
						down = true;
					}
					if (debug)
						System.err.println("Recursive");
				} else if (test == Stone.EMPTY) {
					down = false;
				} else {
					down = true;
				}
			}

		if (!up || !down || !left || !right)
			return false;
		return true;
	}
}
