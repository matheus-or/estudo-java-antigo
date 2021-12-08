package funcionario;

class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	public double getBonificacao() {
		return this.salario * 1.4 + 1000;
	}
	
	public void cobraEntrega() {
		System.out.println("Está pronto?");
	}
	
	public boolean autentica(int senha) {
		
		if(this.senha != senha) {
			return false;
		}
		return true;
	}
}