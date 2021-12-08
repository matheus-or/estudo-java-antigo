package br.com.empresa.conta;

public class ContaPoupanca extends Conta {

	@Override
	public void atualiza(double taxaSelic) {
        this.saldo += this.saldo * taxaSelic * 3;
    }

	@Override
    public void deposita(double valor) {
        this.saldo += valor - 0.10;
    }
}
