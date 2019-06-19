package apresentacao;

import org.junit.Assert;
import org.junit.Test;

import apresentacao.Calculadora;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.somar(2, 3);
		Assert.assertEquals(5, resultado);
		
	}
	
	@Test
	public void testSubtrair() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.subtrair(10,4);
		Assert.assertEquals(6, resultado);
		
	}
	
	
	
}
