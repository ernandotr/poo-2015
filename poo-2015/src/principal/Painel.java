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
import figuras.Retangulo;

public class Painel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JToggleButton btCirculo;
	JToggleButton btRetangulo;
	AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
	public Figura f;
	
	public Painel(){
		JToolBar toobar = new JToolBar();
		
		btCirculo =  new JToggleButton("Círculo");
		btRetangulo = new JToggleButton("Retângulo");
		
		ButtonGroup btGroup = new ButtonGroup();
		btGroup.add(btCirculo);
		btGroup.add(btRetangulo);
		btCirculo.addActionListener(this);
		btRetangulo.addActionListener(this);
		
		toobar.add(btCirculo);
		toobar.add(btRetangulo);
		setLayout(new BorderLayout());
		add(toobar,BorderLayout.NORTH);
		add(areaDeDesenho);
		areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btCirculo){
			System.out.println("Cria Cículo");
			 f = new Retangulo(0, 0, 100, 60);
			areaDeDesenho.setFigura(f);
			this.areaDeDesenho.adicionaFigura(f);
			areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		}
		if(e.getSource() == btRetangulo){
			System.out.println("Cria Retângulo");
			f = new Circulo(10, 10, 100);
			
			areaDeDesenho.setFigura(f);
			this.areaDeDesenho.adicionaFigura(f);
			areaDeDesenho.addMouseListener(new Mouse(areaDeDesenho));
		}
	}
	
}
