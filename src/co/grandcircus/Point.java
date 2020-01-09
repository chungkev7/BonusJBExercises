package co.grandcircus;

public class Point {

	private int x;
	private int y;

	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int calculateDistance(int x, int y) {
		return (int) Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
	}
	
	public void calculateMidpoint(int a, int b) {
		System.out.println("The midpoint between (" + this.x + "," + this.y + ") and (" + a + "," + b + ") is " +
				"(" + (this.x + a) / 2 + "," + (this.y + b) / 2 + ").");
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

 }
