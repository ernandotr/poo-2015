package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import figuras.Figura;

public class AreaDeDesenho extends JPanel{

	private static final long serialVersionUID = 1L;
	private List<Figura> figuras = new ArrayList<Figura>();
	
	private  Figura figura;
	
	public AreaDeDesenho() {
		this.setPreferredSize(new Dimension(600, 400));
	}
	
	public AreaDeDesenho(Figura figura){
		this.figura = figura;
		this.setPreferredSize(new Dimension(600, 400));
	}
	

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Figura f :figuras){
			f.desenha(g);
		}
	}

	public void adicionaFigura(Figura figura){
		figuras.add(figura);
	}

	public Figura getFigura() {
		return figura;
	}

	public void setFigura(Figura figura) {
		this.figura = figura;
	}
	
}
