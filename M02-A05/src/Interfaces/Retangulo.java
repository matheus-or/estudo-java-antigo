package Interfaces;

public class Retangulo implements AreaCalculavel {
	
	private int largura;
	private int altura;
	
	public Retangulo(int novaLargura, int novaAltura) {
		this.largura = novaLargura;
		this.altura = novaAltura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int novaLargura) {
		this.largura = novaLargura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int novaAltura) {
		this.altura = novaAltura;
	}

	@Override
	public double calculaArea() {
		return this.altura * this.largura;
	}
}
