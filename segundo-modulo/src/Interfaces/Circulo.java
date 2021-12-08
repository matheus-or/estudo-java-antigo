package Interfaces;

public class Circulo implements AreaCalculavel {
	
	private double raio;

	public Circulo(double novoRaio) {
		this.raio = novoRaio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double novoRaio) {
		this.raio = novoRaio;
	}
	
	@Override
	public double calculaArea() {
		return raio * Math.PI;
	}
	
}
