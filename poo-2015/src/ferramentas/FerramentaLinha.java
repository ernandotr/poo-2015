package ferramentas;
import figuras.Figura;
import figuras.Linha;

public class FerramentaLinha extends Ferramenta {

	public FerramentaLinha(BarraFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x, int y, int x2, int y2) {
		return new Linha(x, y, x2, y2);
	}

	@Override
	public String getNome() {
		return "Linha";
	}
}