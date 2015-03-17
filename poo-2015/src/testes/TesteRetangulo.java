package testes;

import org.junit.Assert;
import org.junit.Test;

import figuras.Retangulo;

public class TesteRetangulo {

	
	@Test
	public void testaContadorDeInstacias(){
		Retangulo.zeraInstancias();
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
	
	@Test
	public void testaIgual(){
		Retangulo r1  = new Retangulo(32, 35, 40, 60);
		Retangulo r2  = new Retangulo(40, 39, 40, 60);
		Assert.assertEquals(false, Retangulo.igual(r1,r2));
		
		Retangulo r3  = new Retangulo(32, 35, 40, 60);
		Retangulo r4 = new Retangulo(32, 35, 40, 60);
		Assert.assertEquals(true, Retangulo.igual(r3,r4));
		
	}
}
