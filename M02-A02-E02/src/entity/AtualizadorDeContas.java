package entity;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }

    public void roda(Conta c) {
        System.out.println("Saldo anterios: " + c.saldo);// aqui você imprime o saldo anterior
        c.atualiza(this.selic);// atualiza a conta com a taxa selic,
        System.out.println("Saldo Final: " + c.saldo);// e depois imprime o saldo final
        this.saldoTotal += c.saldo;// lembrando de somar o saldo final ao atributo saldoTotal
    }

    // outros métodos, colocar o getter para saldoTotal!
}