package br.com.empresa.banco;

import br.com.empresa.conta.Conta;

import br.com.empresa.conta.ContaCorrente;
import br.com.empresa.conta.ContaPoupanca;
import br.com.empresa.conta.ValorInvalidoException;



public class TestaContas {

	public static void main(String[] args) throws ValorInvalidoException  {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
        c.deposita(1000); 
        cc.deposita(1000); 
        cp.deposita(1000);

        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);

        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.printf("O saldo é: %.2f\n", cp.getSaldo());
	}
}
