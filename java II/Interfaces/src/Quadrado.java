
public class Quadrado implements AreaCalculavel {
	
	private int lado;

	public Quadrado(int novoLado) {
		this.lado = novoLado;
	}
	
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}
	

}
