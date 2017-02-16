
public class Ellipse implements Shape {

	public double a_axis;
	public double b_axis;
	
	public Ellipse(double a_axis, double b_axis) {
		this.a_axis = a_axis;
		this.b_axis = b_axis;
	}
	
	@Override
	public double getArea() {
		return Math.PI * this.a_axis * this.b_axis;
	}

	@Override
	public double getPerimeter() {
		double a = this.a_axis;
		double b = this.b_axis;
		return Math.PI * (3 * (a + b) - Math.sqrt(3 * (a+b) * (a + (3 * b))));
	}

}
