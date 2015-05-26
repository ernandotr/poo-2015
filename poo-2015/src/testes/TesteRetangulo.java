package testes;

import org.junit.Assert;
import org.junit.Test;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class TesteRetangulo {

	
	@Test
	public void testaImprime() {
		Retangulo r = new Retangulo(31, 31, 40, 50);
		
		String saida = r.imprime();
		Assert.assertEquals("retangulo[X:31,Y:31,l:40,a:50]", saida);
		
		Retangulo r2 = new Retangulo(14, 9, 35, 67);
		Assert.assertEquals("retangulo[X:14,Y:9,l:35,a:67]", r2.imprime());
	}


	@SuppressWarnings("unused")
	@Test
	public void testaHerança() {
		Retangulo r = new Retangulo(31, 31, 40, 50);
		Circulo c = new Circulo (31, 56, 20);
		
		Figura f1 = r;
		Figura f2 = c;
		
		String saida = r.imprime();
		Assert.assertEquals("retangulo[X:31,Y:31,l:40,a:50]", saida);
		
		Retangulo r2 = new Retangulo(14, 9, 35, 67);
		Assert.assertEquals("retangulo[X:14,Y:9,l:35,a:67]", r2.imprime());
	}
	
}
