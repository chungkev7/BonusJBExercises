package co.grandcircus;

public class Triangle {

	private int side1Length;
	private int side2Length;
	private int side3Length;

	public Triangle() {
		super();
	}

	public Triangle(int side1Length, int side2Length, int side3Length) {
		super();
		this.side1Length = side1Length;
		this.side2Length = side2Length;
		this.side3Length = side3Length;
	}

	public int getSide1Length() {
		return side1Length;
	}

	public void setSide1Length(int side1Length) {
		this.side1Length = side1Length;
	}

	public int getSide2Length() {
		return side2Length;
	}

	public void setSide2Length(int side2Length) {
		this.side2Length = side2Length;
	}

	public int getSide3Length() {
		return side3Length;
	}

	public void setSide3Length(int side3Length) {
		this.side3Length = side3Length;
	}

	public int calculatePerimeter () {
		return this.side1Length + this.side2Length + this.side3Length;
	}
	
	public int calculateArea() {
		return (int)((0.5 * this.side2Length) * this.side1Length);
	}
	
	@Override
	public String toString() {
		return "Triangle [side1Length=" + side1Length + ", side2Length=" + side2Length + ", side3Length=" + side3Length
				+ "]";
	}

}
