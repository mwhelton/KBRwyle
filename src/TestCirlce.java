import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCirlce {

	Circle circle = new Circle(3);
	
	@Test
	public void testGetPerimeter() {
		assertEquals(18.8495, circle.getPerimeter(), 0.0001);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(28.2743, circle.getArea(), 0.0001);
	}
}
