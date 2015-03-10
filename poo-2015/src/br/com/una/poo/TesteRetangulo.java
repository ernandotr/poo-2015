package br.com.una.poo;

import org.junit.Assert;
import org.junit.Test;

public class TesteRetangulo {

	
	@Test
	public void testaContadorDeInstacias(){
		Assert.assertEquals(0, Retangulo.instancias());
		
		Retangulo r1 = new Retangulo(31, 31, 50, 40);
		Retangulo r2 = new Retangulo(15, 45, 52, 40);
		Assert.assertEquals(2, Retangulo.instancias());
		
		Retangulo r3 = new Retangulo(15, 45, 52, 40);
		Assert.assertEquals(3, Retangulo.instancias());
	}
	
	@Test
	public void testarImprime(){
		Retangulo retangulo = new Retangulo(10, 15, 100, 80);
		String result = retangulo.imprimir();
		Assert.assertEquals("retângulo[x:10,y:15,largura:100,altura:80]",result);
	}
}
