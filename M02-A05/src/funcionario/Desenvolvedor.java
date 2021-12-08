package funcionario;

class Desenvolvedor extends Funcionario {
	
	public double getBonificacao() {
		return this.salario * 0.25;
	}
	
}