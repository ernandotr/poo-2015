package ferramentas;
import figuras.Circulo;
import figuras.Figura;

public class FerramentaCirculo extends Ferramenta {

	public FerramentaCirculo(BarraFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x, int y, int x2, int y2) {
		int dx = Math.abs(x2 - x);
		int dy = Math.abs(y2 - y);
		int raio = (int) Math.sqrt(dx*dx + dy*dy);
		return new Circulo(x, y, raio);
	}

	@Override
	public String getNome() {
		return "Círculo";
	}
}