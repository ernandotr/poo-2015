package figuras;

import java.awt.Graphics;

public class Linha extends Figura {
	
	private int x2;
	private int y2;
	
	public Linha(int x, int y, int x2, int y2) {
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	@Override
	public void desenha(Graphics g) {
		g.drawLine(x, y, x2, y2);
	}
}
