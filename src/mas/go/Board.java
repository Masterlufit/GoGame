package mas.go;

public class Board {
	private String[][] board = new String[19][19];
	private String whoseTurn;

	private final String black = "black";
	private final String white = "white";

	public Board() {
		whoseTurn = black;
	}

	public void setPosition(int x, int z, String type) {
		this.board[x - 1][z - 1] = type;
	}

	public String[][] getBoard() {
		return this.board;
	}

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

}
