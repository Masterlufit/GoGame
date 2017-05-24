package mas.go.util;

public class Location {
	private int x, y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	@Deprecated
	public void setX(int newX) {
		this.x = newX;
	}

	@Deprecated
	public void setY(int newY) {
		this.y = newY;
	}
}