package Banco;

public class ContaCorrente extends Conta implements Tributavel{

	public void atualiza(double valor) {
		this.saldo += valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
	

}
