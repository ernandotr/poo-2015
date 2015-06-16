package ferramentas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import figuras.Figura;

public abstract class Ferramenta implements ActionListener {

	private BarraFerramentas barra;
	
	public Ferramenta(BarraFerramentas barra) {
		this.barra = barra;
	}
	
	public abstract Figura criaFigura(int x, int y, int x2, int y2);
	
	public void actionPerformed(ActionEvent e) {
		this.barra.setFerramentaAtiva(this);
	}
	
	public abstract String getNome();
	
	public boolean isFerramentaPadrao() {
		return false;
	}
}
