package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ferramentas.BarraFerramentas;

public class Paint extends JFrame{

	private static final long serialVersionUID = 1L;
	
	AreaDeDesenho areaDeDesenho;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Paint aplicacao = new Paint();
	}

	public Paint() {
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		BarraFerramentas barraDeFerramentas = new BarraFerramentas(); 
		barraDeFerramentas.btExportar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				exportar();
				
			}
		});
		painelPrincipal.add(barraDeFerramentas, BorderLayout.NORTH);
		
		areaDeDesenho = new AreaDeDesenho();
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		
		GerenciadorEventos gerenciador = new GerenciadorEventos(areaDeDesenho, barraDeFerramentas);
		areaDeDesenho.addMouseListener(gerenciador);
		areaDeDesenho.addMouseMotionListener(gerenciador);
		
		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	public void exportar() {
		JFileChooser exportar = new JFileChooser();
		int resultado = exportar.showSaveDialog(this);
				
		if(resultado == JFileChooser.APPROVE_OPTION){
			File arquivo = exportar.getSelectedFile();
			try {
				BufferedImage in = new BufferedImage(areaDeDesenho.getWidth(), areaDeDesenho.getHeight(), BufferedImage.TYPE_INT_ARGB);
				areaDeDesenho.paint(in.getGraphics());
				ImageIO.write(in, "png", arquivo);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro na gravação do arquivo!","Erro!",JOptionPane.ERROR_MESSAGE);
			}
			
			
		}else{
			System.out.println("Nenhum arquivo selecionado!");
		}
	}
	
}
