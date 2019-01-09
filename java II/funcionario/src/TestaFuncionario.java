class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Gerente joao = new Gerente();
		joao.setNome("Joao");
		joao.setSalario(1000.0);
		
		System.out.println(joao.getBonificacao());
		
		Gerente joaquim = new Gerente();
		joaquim.setNome("Joaquim");
		joaquim.setSalario(2000.0);
		joaquim.cobraEntrega();
		
		System.out.println(joaquim.getBonificacao());
		
		ControleDeBonificacao totalizador = new ControleDeBonificacao();
		totalizador.registra(joao);
		totalizador.registra(joaquim);
		
		System.out.println(totalizador.getTotalDeBonificacoes());
		
	}
}