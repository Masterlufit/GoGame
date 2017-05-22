package mas.go;

public class Coordinates {
	private int x, y;

	public Coordinates(int x, int y) {
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
