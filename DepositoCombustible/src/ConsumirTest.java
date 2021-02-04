import static org.junit.Assert.*;

import org.junit.Test;

public class ConsumirTest {

	@Test
	public void testConsumir() {
		DepositoCombustible d = new DepositoCombustible(50, 20);
		d.consumir(15);
		double res = d.getDepositoNivel();
		assertEquals(5, res, 0);
	}

}
