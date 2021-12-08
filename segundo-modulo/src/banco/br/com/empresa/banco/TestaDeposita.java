package banco.br.com.empresa.banco;

import banco.br.com.empresa.conta.Conta;
import banco.br.com.empresa.conta.ContaCorrente;
import banco.br.com.empresa.conta.ValorInvalidoException;

public class TestaDeposita {
	
	public static void main(String[] args) {
		Conta cp = new ContaCorrente();
		
		try {
			cp.deposita(-500);
		} catch (ValorInvalidoException b) {
			System.out.println(b.getMessage());
		}
	}
}