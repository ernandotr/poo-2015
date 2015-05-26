package principal;

import javax.swing.JFrame;

public class Paint extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Paint aplicacao = new Paint();
	}

	public Paint() {
				
		Painel painel = new Painel();
		
		this.setContentPane(painel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	
}
