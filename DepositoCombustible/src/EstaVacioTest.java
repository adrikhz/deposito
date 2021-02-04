import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EstaVacioTest {
	DepositoCombustible d;
	
	@Before
	public void inicioPruebas() {
		d = new DepositoCombustible(50, 10);
		d.consumir(10);
	}
	
	@Test
	public void testEstaVacio() {
		assertTrue(d.estaVacio());
	}

}
