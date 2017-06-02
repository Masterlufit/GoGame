package mas.go.util;

public enum Stone {
	BLACK(), WHITE(), BOARDER(), EMPTY();

	public static Stone getValue(String value) {
		value = value.trim().toLowerCase();
		if (value.equals("black")) {
			return WHITE;
		} else {
			return BLACK;
		}
	}

	public String toString() {
		switch (this) {
		case BLACK:
			return "black";
		case WHITE:
			return "white";
		case BOARDER:
			return "boarder";
		case EMPTY:
			return "empty";
		default:
			return "WHATTTT??";
		}
	}
}
