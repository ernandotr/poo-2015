package principal;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Paint extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		// Criar algumas figuras que serão desenhadas
//		Figura fc = new Circulo(100, 300, 40);
//		Figura fr = new Retangulo(200, 200, 200, 120);
		//Figura []figuras = new Figura[]{fr,fc};
				
		//AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
		//areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		
		Painel painel = new Painel();
		
		//painel.add(areaDeDesenho, BorderLayout.CENTER);
		
		this.setContentPane(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
}
