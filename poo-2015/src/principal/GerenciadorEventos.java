package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import ferramentas.BarraFerramentas;
import ferramentas.Ferramenta;
import figuras.Figura;

public class GerenciadorEventos extends MouseAdapter {

	private AreaDeDesenho area;
	private BarraFerramentas barraDeFerramentas;
	Ferramenta ferramenta;
	
	public GerenciadorEventos(AreaDeDesenho area, BarraFerramentas barraDeFerramentas) {
		this.area = area;
		this.barraDeFerramentas = barraDeFerramentas;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		ferramenta = barraDeFerramentas.leFerramentaSelecionada();
		Figura f = ferramenta.criaFigura(e.getX(), e.getY(), e.getX(), e.getY());
		this.area.adicionaFigura(f);
		//this.area.repaint();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		super.mouseDragged(e);

		this.area.setFigura(ferramenta.criaFigura(this.area.getFigura().getX(), this.area.getFigura().getY(), e.getX(), e.getY()));
		this.area.repaint();
	}
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		
			
		this.area.setFigura(ferramenta.criaFigura(this.area.getFigura().getX(), this.area.getFigura().getY(), e.getX(), e.getY()));
		//area.adicionaFigura(figura);
		area.repaint();
	}
}
