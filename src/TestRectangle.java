import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRectangle {

	public Rectangle rectangle = new Rectangle(2, 4);
	
	@Test
	public void testGetPerimeter() {
		assertEquals(12.0, rectangle.getPerimeter(), 0.0001);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(8.0, rectangle.getArea(), 0.0001);
	}
}
