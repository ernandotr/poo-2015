package figuras;

import java.awt.Graphics;

public class Retangulo extends Figura{

	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int largura, int altura) {
		super(x, y);
		this.altura = altura;
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}
	
	@Override
	public void desenha(Graphics g) {
		g.drawRect(x, y, largura, altura);
	}
}
