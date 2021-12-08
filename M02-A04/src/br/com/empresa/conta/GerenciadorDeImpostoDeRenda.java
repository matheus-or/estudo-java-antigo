package br.com.empresa.conta;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double novoTotal) {
		this.total = novoTotal;
	}

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando Tributavel: " + t);
		
		this.setTotal(this.getTotal() + t.calculaTributos());
	}
}
