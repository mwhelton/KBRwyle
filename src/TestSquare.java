import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSquare {

	Square square = new Square(3);
	
	@Test
	public void testGetPerimeter() {
		assertEquals(12.0, square.getPerimeter(), 0.0001);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(9.0, square.getArea(), 0.0001);
	}
}
