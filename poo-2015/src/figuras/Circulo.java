package figuras;

import java.awt.Graphics;

public class Circulo extends Figura{

	private int raio = 0;
	

	public Circulo(int x, int y, int raio) {
		super(x, y);
		this.raio = raio;
	}

	public String imprime() {
		return "circulo[X:"+this.x+",Y:"+this.y+",raio:"+this.raio+"]";
	}

	public int getRaio() {
		return raio;
	}

	@Override
	public void desenha(Graphics g) {
		g.drawOval(x, y, raio, raio);
	}
	
}
