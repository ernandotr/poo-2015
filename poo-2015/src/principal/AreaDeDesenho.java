package principal;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import figuras.Circulo;
import figuras.Figura;

public class AreaDeDesenho extends JPanel{

	private Figura[] figuras;
	
	public AreaDeDesenho() {
		this.setPreferredSize(new Dimension(600, 400));
	}
	
	public AreaDeDesenho(Figura[] figuras){
		this.figuras = figuras; 
		this.setPreferredSize(new Dimension(600, 400));
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Figura f :figuras){
			f.desenha(g);
		}
	}

}
