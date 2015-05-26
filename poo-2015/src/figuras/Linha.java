package figuras;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import principal.AreaDeDesenho;
import principal.Mouse;

public class Linha extends Figura implements ActionListener{
	
	private Ponto p1 =  new Ponto();
	
	private Ponto p2 = new Ponto();
	
	public Linha(){}
	
	public Linha(Ponto p1, Ponto p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Linha(int x1, int y1, int x2, int y2){
		
		this.p1.setX(x1);
		this.p1.setY(y1);
		this.p2.setX(x2);
		this.p2.setY(y2);
	}

	public Ponto getP1() {
		return p1;
	}

	public void setP1(Ponto p1) {
		this.p1 = p1;
	}

	public Ponto getP2() {
		return p2;
	}

	public void setP2(Ponto p2) {
		this.p2 = p2;
	}
	
	@Override
	public void desenha(Graphics g) {
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Mouse(new AreaDeDesenho(new Linha()));
		
	}

}
