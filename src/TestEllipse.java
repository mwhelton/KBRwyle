import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestEllipse {

	Ellipse ellipse = new Ellipse(2, 3);
	
	@Test
	public void testGetPerimeter() {
		assertEquals(6.7694, ellipse.getPerimeter(), 0.0001);
	}
	
	@Test
	public void testGetArea() {
		assertEquals(18.8495, ellipse.getArea(), 0.0001);
	}
}
