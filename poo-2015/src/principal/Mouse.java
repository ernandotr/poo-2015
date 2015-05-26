package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Circulo;
import figuras.Figura;
import figuras.Linha;
import figuras.Retangulo;

public class Mouse extends MouseAdapter{
	
	private AreaDeDesenho areaDeDesenho;
	
	private Figura figura;
	
	public Mouse(){
	}
	
	public Mouse(AreaDeDesenho areaDeDesenho){
		this.areaDeDesenho = areaDeDesenho;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		
		figura = new Figura(e.getX(),e.getY());
//		if(areaDeDesenho.getFigura() instanceof Retangulo){
//			f = new Retangulo(e.getX(), e.getY(), 100, 80);
//		}
//		if(areaDeDesenho.getFigura() instanceof Linha){
//			f = new Linha(e.getX(), e.getY(), 100, 80);
//		}
//		if(areaDeDesenho.getFigura() instanceof Circulo){
//			f = new Circulo(e.getX(), e.getY(), 50);
//		}
//		this.areaDeDesenho.adicionaFigura(f);
//		areaDeDesenho.repaint();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		
		if(areaDeDesenho.getFigura() instanceof Retangulo){
			figura = new Retangulo(figura.getX(), figura.getY(), e.getX(), e.getY());
		}
		if(areaDeDesenho.getFigura() instanceof Linha){
			figura = new Linha(figura.getX(), figura.getY(), e.getX(), e.getY());
		}
		if(areaDeDesenho.getFigura() instanceof Circulo){
			figura = new Circulo(figura.getX(), figura.getY(), figura.getX() + figura.getY());
		}
		this.areaDeDesenho.adicionaFigura(figura);
		areaDeDesenho.repaint();
	}
}
