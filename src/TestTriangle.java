import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTriangle {
	
	Triangle triangle = new Triangle(2, 3, 4);
	
	@Test
	public void testGetPerimeter() {
		assertEquals(9.0, triangle.getPerimeter(), 0.0001);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(2.9047, triangle.getArea(), 0.0001);
	}
}
