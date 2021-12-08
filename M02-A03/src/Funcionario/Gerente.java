package Funcionario;

public class Gerente extends Funcionario{
	
	public boolean autentica(int senha) {
		return true;
	}
	
	public double getBonificacao() {
		return this.getSalario() * 1.4 + 1000;
		
		
	}

}
