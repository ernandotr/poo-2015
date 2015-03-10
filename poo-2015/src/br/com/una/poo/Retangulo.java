package br.com.una.poo;

public class Retangulo {

	private int x;
	private int y;
	private int largura;
	private int altura;
	
	private static int instacias = 0;
	
	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
		instacias++;
	}
	
	public String imprimir(){
		return "retângulo[x:"+getX()+",y:"+getY()+",largura:"+getLargura()+",altura:"+getAltura()+"]";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static int instancias() {
		
		return instacias;
	}
	
	
}
