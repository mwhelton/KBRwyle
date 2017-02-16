
public class Triangle implements Shape {

	public double side1;
	public double side2;
	public double side3;
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
	}

	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

}
