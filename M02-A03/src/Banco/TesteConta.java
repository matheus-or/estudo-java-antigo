package Banco;

public class TesteConta {
	public static void main(String[] args) {

		//ContaCorrente cc = new ContaCorrente();
		//cc.deposita(100);
		//System.out.println(cc.calculaTributos());

		//Tributavel t = cc;
		//System.out.println(t.calculaTributos());
		
		//System.out.println(t.getSaldo());
		
		//System.out.println("----------------------------------------------------------------------------------");
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
	}
}