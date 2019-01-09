
public class Diretor extends Funcionario implements Autenticavel {
	
	@Override
	double getBonificacao() {
		return 0;
	}
	
	public boolean autentica(int senha) {
		
		if(this.getSenha() != senha) {
			return false;
		}
		return true;
	}

}
