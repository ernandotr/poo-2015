package principal;

import javax.swing.JFrame;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame{

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		// Criar algumas figuras que serão desenhadas
		Figura fc = new Circulo(100, 300, 40);
		Figura fr = new Retangulo(200, 200, 200, 120);
		Figura []figuras = new Figura[]{fr,fc};
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(figuras);
		this.setContentPane(areaDeDesenho);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
