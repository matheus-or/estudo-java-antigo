package banco.br.com.empresa.banco;

import banco.br.com.empresa.conta.ContaCorrente;
import banco.br.com.empresa.conta.GerenciadorDeImpostoDeRenda;
import banco.br.com.empresa.conta.SeguroDeVida;
import banco.br.com.empresa.conta.ValorInvalidoException;

public class TestaGerenciadorDeImpostoDeRenda {
	
	public static void main(String[] args) throws ValorInvalidoException {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		ContaCorrente cc = new ContaCorrente();
		
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
	}

}
