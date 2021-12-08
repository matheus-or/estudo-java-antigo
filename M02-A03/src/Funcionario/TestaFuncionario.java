package Funcionario;

public class TestaFuncionario {
	public static void main(String[] args) {
		
		//ControleDeBonificacoes cdb = new ControleDeBonificacoes();
		//cdb.registra(f);
		
		Funcionario f = new Gerente();
		
		f.setNome("Matheus");
		f.setCpf("32123121");
		f.setSalario(3000.0);
		
		f.mostra();
		
	}
}
