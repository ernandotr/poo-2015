package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Figura;
import figuras.Retangulo;

public class Mouse extends MouseAdapter{
	
	private AreaDeDesenho areaDeDesenho;
	
	Mouse(AreaDeDesenho areaDeDesenho){
		this.areaDeDesenho = areaDeDesenho;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		super.mouseClicked(e);
		
		Figura f = new Retangulo(e.getX(), e.getY(), 100, 60);
		this.areaDeDesenho.adicionaFigura(f);
		areaDeDesenho.repaint();
		System.out.println("Clicado!");
	}
}
