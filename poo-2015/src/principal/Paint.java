package principal;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ferramentas.BarraFerramentas;

public class Paint extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Paint aplicacao = new Paint();
	}

	public Paint() {
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		BarraFerramentas barraDeFerramentas = new BarraFerramentas(); 
		painelPrincipal.add(barraDeFerramentas, BorderLayout.NORTH);
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		
		GerenciadorEventos gerenciador = new GerenciadorEventos(areaDeDesenho, barraDeFerramentas);
		areaDeDesenho.addMouseListener(gerenciador);
		areaDeDesenho.addMouseMotionListener(gerenciador);
		
		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
}
