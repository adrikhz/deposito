import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EstaLlenoTest {
	DepositoCombustible d;
	
	@Before
	public void inicioPruebas() {
		d = new DepositoCombustible(50, 20);
		d.fill(30);
	}

	@Test
	public void testEstaLleno() {
		assertTrue(d.estaLleno());
	}

}
