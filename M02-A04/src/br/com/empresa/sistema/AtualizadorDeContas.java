package br.com.empresa.sistema;

import br.com.empresa.conta.Conta;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    public void setSaldoTotal(double novoSaldoTotal) {
        this.saldoTotal = novoSaldoTotal;
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        // aqui você imprime o saldo anterior
        System.out.println(c.getSaldo());

        // atualiza a conta com a taxa selic,
        c.atualiza(this.selic);

        // e depois imprime o saldo final
        System.out.println(c.getSaldo());

        // lembrando de somar o saldo final ao atributo saldoTotal
        this.setSaldoTotal(this.getSaldoTotal() + c.getSaldo());
    }


}
