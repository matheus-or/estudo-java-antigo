package entity;

public class Conta {

    protected double saldo;

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void deposita(double novoDeposito) {
        this.saldo += novoDeposito;
    }

    public void saca(double novoSaque) {
        this.saldo -= novoSaque;
    }

    public void atualiza(double taxa) {
        this.saldo = this.saldo + (this.saldo * taxa);
    }

}