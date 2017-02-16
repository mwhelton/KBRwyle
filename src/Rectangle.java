
public class Rectangle implements Shape {

	public double height;
	public double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return this.height * this.width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}

}
