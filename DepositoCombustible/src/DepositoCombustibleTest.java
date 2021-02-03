import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible d = new DepositoCombustible(50, 20);
		double res = d.getDepositoMax();
		assertEquals(50, res, 0);
	}

}
