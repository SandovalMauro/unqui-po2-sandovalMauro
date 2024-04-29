package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitoTest {
	private Digito digito;
	private int[] numeros;

	
	@BeforeEach
	public void setUp() throws Exception{
		digito = new Digito();
		numeros = new int[] {132,44,66,58,23};
	}
	
	@Test
	public void testCantidadDigitosPares() {
		int resultado = digito.cantidadDigitosPares(numeros);
		assertEquals(resultado,44);
	}

}
