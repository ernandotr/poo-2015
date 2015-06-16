package ferramentas;
import figuras.Figura;
import figuras.Retangulo;

public class FerramentaRetangulo extends Ferramenta {

	public FerramentaRetangulo(BarraFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x, int y, int x2, int y2) {
		int dx = Math.abs(x2 - x);
		int dy = Math.abs(y2 - y);
		return new Retangulo(x, y, dx, dy);
	}

	@Override
	public String getNome() {
		return "Retângulo";
	}
	@Override
	public boolean isFerramentaPadrao() {
		return true;
	}
}