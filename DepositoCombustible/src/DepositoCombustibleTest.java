import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible d = new DepositoCombustible(50, 20);
		double res = d.getDepositoNivel();
		assertEquals(20, res, 0);
	}

}
