package figuras;

import java.awt.Graphics;

public class Figura {

	protected int x;
	protected int y;
	
	public Figura(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Figura(){}

	public void desenha(Graphics g) {
		
	}
	
	public String imprime() {
		return "figura[X:"+this.x+",Y:"+this.y+"]";
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
}
