package Banco;

public abstract class Conta {

	protected double saldo;
	
	protected double taxaSelic;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	abstract void deposita(double valor);

	abstract void atualiza(double taxaSelic);

	public void saca(double valor) {
		this.saldo -= valor;

	}

}