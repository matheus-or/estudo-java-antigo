package entity;

public class ContaCorrente extends Conta {

    public void atualiza(double taxa) {
        this.saldo = this.saldo + (this.saldo * (taxa * 2));
    }

}