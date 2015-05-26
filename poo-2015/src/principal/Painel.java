package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import figuras.Circulo;
import figuras.Figura;
import figuras.Linha;
import figuras.Retangulo;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;

	JToggleButton btCirculo;
	JToggleButton btRetangulo;
	JToggleButton btLinha;
	AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
	public Figura f;
	
	public Painel(){
		JToolBar toobar = new JToolBar();
		
		btCirculo =  new JToggleButton("Círculo");
		btRetangulo = new JToggleButton("Retângulo");
		btLinha = new JToggleButton("Linha");
		
		ButtonGroup btGroup = new ButtonGroup();
		btGroup.add(btCirculo);
		btGroup.add(btRetangulo);
		btGroup.add(btLinha);
		
		btCirculo.addActionListener(new BotaCirculo());
		btRetangulo.addActionListener(new BotaRetagulo());
		btLinha.addActionListener(new BotaLinha());
		
		toobar.add(btCirculo);
		toobar.add(btRetangulo);
		toobar.add(btLinha);
		
		setLayout(new BorderLayout());
		add(toobar,BorderLayout.NORTH);
		add(areaDeDesenho);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == btCirculo){
//			f = new Circulo();
//			areaDeDesenho.setFigura(f);
//		}
//		if(e.getSource() == btRetangulo){
//			f = new Retangulo();
//			areaDeDesenho.setFigura(f);
//		}
//		if(e.getSource() == btLinha){
//			f = new Linha();
//			areaDeDesenho.setFigura(f);
//		}
//		areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
//	}
	
	class BotaCirculo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			f = new Circulo();
			areaDeDesenho.setFigura(f);
			areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		}
		
	}
	class BotaLinha implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			f= new Linha();
			areaDeDesenho.setFigura(f);
			areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		}
		
	}
	
	class BotaRetagulo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			f= new Retangulo();
			areaDeDesenho.setFigura(f);
			areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		}
		
	}
}
