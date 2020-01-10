package co.grandcircus;

public class Square {

	private int sideLength;

	public Square() {
		super();
	}

	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	public int calculatePerimeter() {
		return 4 * this.sideLength;
	}
	
	public int calculateArea() {
		return this.sideLength * this.sideLength;
	}
	
	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + "]";
	}

}
