package Banco;

public class ContaPoupanca extends Conta {

	@Override
	void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	void atualiza(double taxaSelic) {
		this.saldo = this.saldo * taxaSelic;

	}

}
