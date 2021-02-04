import static org.junit.Assert.*;

import org.junit.Test;

public class FillTest {

	@Test
	public void testFill() {
		DepositoCombustible d = new DepositoCombustible(50, 20);
		d.fill(20);
		double res = d.getDepositoNivel();
		assertEquals(40, res, 0);
	}

}
