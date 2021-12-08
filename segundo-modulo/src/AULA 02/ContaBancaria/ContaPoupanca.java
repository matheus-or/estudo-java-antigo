class ContaPoupanca extends Conta {
    public void atualiza(double taxa){
        this.saldo = this.saldo + (this.saldo * (taxa * 3));
    }
    public void deposita(double novoDeposito){
        this.saldo += novoDeposito - 0.10;
    }
}