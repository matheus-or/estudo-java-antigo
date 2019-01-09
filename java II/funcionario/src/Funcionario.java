public abstract class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	private int senha;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double novoSalario) {
		this.salario = novoSalario;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int novaSenha) {
		this.senha = novaSenha;
	}
	
	abstract double getBonificacao();

	

}