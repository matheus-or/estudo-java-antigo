
public class Cliente implements Autenticavel {

	private String nome;
	private int senha;	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	@Override
	public boolean autentica(int senha) {
		
		if(this.senha != senha) {
			return false;
		}
		return true;
	}
}