package br.com.una.poo;

import org.junit.Assert;
import org.junit.Test;

public class TesteRetangulo {

	@Test
	public void testarRetangulo(){
		Retangulo retangulo = new Retangulo(10, 15, 100, 80);
		String result = retangulo.imprimir();
		Assert.assertEquals("Retângulo[x:10,y:15,largura:100,altura:80]",result);
	}
}
