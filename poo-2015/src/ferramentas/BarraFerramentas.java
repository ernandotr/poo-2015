package ferramentas;

	import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

	public class BarraFerramentas extends JToolBar {

		private static final long serialVersionUID = -8402380230249599609L;
		
		ButtonGroup grupo;
		
		public JButton btExportar = new JButton("Exportar");
		
		private Ferramenta ferramenta;
		
		public BarraFerramentas() {
			super("Barra de Ferramentas");
			this.grupo = new ButtonGroup();
			
			Ferramenta[] ferramentas = new Ferramenta[]{
				new FerramentaRetangulo(this),
				new FerramentaCirculo(this),
				new FerramentaLinha(this)
			};
			for (Ferramenta f : ferramentas) {
				criarBotao(f);
			}
			this.setFloatable(false);
		}

		private JToggleButton criarBotao(Ferramenta ferramenta) {
			JToggleButton botao = new JToggleButton(ferramenta.getNome());
			botao.addActionListener(ferramenta);
			grupo.add(botao);
			this.add(botao);
			this.add(btExportar);
			if (ferramenta.isFerramentaPadrao()) {
				botao.getModel().setPressed(true);
				this.ferramenta = ferramenta;
			}
			return botao;
		}
		
		public Ferramenta leFerramentaSelecionada() {
			return this.ferramenta;
		}

		public void setFerramentaAtiva(Ferramenta ferramenta) {
			this.ferramenta = ferramenta;
		}
		
}
