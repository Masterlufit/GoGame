package mas.go.util;

public enum Position {
	UP(), DOWN(), LEFT(), RIGHT(), NULL();

	public String toString() {
		switch (this) {
		case UP:
			return "up";
		case DOWN:
			return "down";
		case LEFT:
			return "left";
		case RIGHT:
			return "right";
		default:
			return null;
		}
	}
}
