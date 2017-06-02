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
			if (this.checkSelfCapture(new Location(x, y), piece, Position.NULL)) {
				// Disable Self Capture
				logger.illegal("Player " + type + " tried to place a piece at X:" + x + " Y:" + y
						+ " when it is self capture!");
				return false;
			}

			// Legal Move
			this.setPosition(x, y, type);
			// Log history only if legal
			this.addHistory(new Location(x, y), Stone.valueOf(type.toUpperCase()));
			// Next turn for player
			this.nextTurn();

			logger.gameplay("Player " + type + " placed a piece at X:" + x + " Y:" + y);
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
		this.board[x][y] = Stone.valueOf(type.toUpperCase());
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

	// Get surrounding pieces
	public HashMap<Position, Stone> getSurroundings(Location loc) {
		HashMap<Position, Stone> surroundings = new HashMap<>();
		int x = loc.getX(), y = loc.getY();
		// Up
		y++;
		if (y > 18) {
			surroundings.put(Position.UP, Stone.EMPTY);
		} else {
			surroundings.put(Position.UP, this.getPieceFromPosition(x, y));
		}
		y--;
		// Down
		y--;
		if (y < 0) {
			surroundings.put(Position.DOWN, Stone.EMPTY);
		} else {
			surroundings.put(Position.DOWN, this.getPieceFromPosition(x, y));
		}
		y++;
		// Left
		x--;
		if (x < 0) {
			surroundings.put(Position.LEFT, Stone.EMPTY);
		} else {
			surroundings.put(Position.LEFT, this.getPieceFromPosition(x, y));
		}
		x++;
		// Right
		x++;
		if (x > 18) {
			surroundings.put(Position.RIGHT, Stone.EMPTY);
		} else {
			surroundings.put(Position.RIGHT, this.getPieceFromPosition(x, y));
		}
		x--;
		return surroundings;
	}

	// Check Self Capture
	public boolean checkSelfCapture(Location loc, Stone s, Position fromPos) {
		System.out.println("1");
		boolean output = false;
		HashMap<Position, Stone> surroundings = this.getSurroundings(loc);
		Stone original = this.getPieceFromPosition(loc.getX(), loc.getY());

		boolean up = false;
		boolean down = false;
		boolean left = false;
		boolean right = false;
		for (Position pos : surroundings.keySet()) {
			if (pos == fromPos) {
				String positionString = fromPos.toString().toLowerCase();
				if (positionString.equals("up")) {
					up = true;
				} else if (positionString.equals("down")) {
					down = true;
				} else if (positionString.equals("left")) {
					left = true;
				} else if (positionString.equals("right")) {
					right = true;
				}
				System.out.println("Recursive!");
			} else {
				if (pos == Position.UP) {System.out.println("UP!");
					Location newLocation = loc.add(0, 1);
					Stone detect = this.getPieceFromPosition(newLocation.getX(), newLocation.getY());
					// System.out.println(newLocation);

					if (detect == Stone.BOARDER) {System.out.println("Boarder!");
						up = true;
					} else if (detect == Stone.EMPTY) {System.out.println("Air!");
						up = false;
					} else {System.out.println("Hit Wall!");
						if (detect == original) {System.out.println("Same Color!");
							this.checkSelfCapture(newLocation, detect, Position.UP);
						} else {System.out.println("WALLLLL!");
							up = true;
						}
					}
					loc.add(0, -1);
				} else if (pos == Position.DOWN) {System.out.println("DOWN!");
					Location newLocation = loc.add(0, -1);
					Stone detect = this.getPieceFromPosition(newLocation.getX(), newLocation.getY());

					if (detect == Stone.BOARDER) {System.out.println("Boarder!");
						down = true;
					} else if (detect == Stone.EMPTY) {System.out.println("Air!");
						down = false;
					} else {
						if (detect == original) {System.out.println("Same Color!");
							this.checkSelfCapture(newLocation, detect, Position.DOWN);
						} else {System.out.println("WALLLLL!");
							down = true;
						}
					}
					loc.add(0, 1);
				} else if (pos == Position.LEFT) {System.out.println("LEFT!");
					Location newLocation = loc.add(-1, 0);
					Stone detect = this.getPieceFromPosition(newLocation.getX(), newLocation.getY());

					if (detect == Stone.BOARDER) {System.out.println("Boarder!");
						down = true;
					} else if (detect == Stone.EMPTY) {System.out.println("Air!");
						left = false;
					} else {
						if (detect == original) {System.out.println("Same Color!");
							this.checkSelfCapture(newLocation, detect, Position.LEFT);
						} else {System.out.println("WALLLLL!");
							left = true;
						}
					}
					loc.add(1, 0);
				} else if (pos == Position.RIGHT) {System.out.println("RIGHT!");
					Location newLocation = loc.add(1, 0);
					Stone detect = this.getPieceFromPosition(newLocation.getX(), newLocation.getY());

					if (detect == Stone.BOARDER) {System.out.println("Boarder!");
						down = true;
					} else if (detect == Stone.EMPTY) {System.out.println("Air!");
						right = false;
					} else {
						if (detect == original) {System.out.println("Same Color!");
							this.checkSelfCapture(newLocation, detect, Position.RIGHT);
						} else {System.out.println("WALLLLL!");
							right = true;
						}
					}
					loc.add(-1, 0);
				}
			}
		}

		if (up && down && left && right) {
			output = true;
		}
		System.out.println("end");
		System.out.println(output);
		return output;
	}
}
