package ferramentas;
import figuras.Figura;
import figuras.Retangulo;

public class FerramentaRetangulo extends Ferramenta {

	public FerramentaRetangulo(BarraFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x, int y, int x2, int y2) {
		return new Retangulo(x, y, x2, y2);
	}

	@Override
	public String getNome() {
		return "Retângulo";
	}
}