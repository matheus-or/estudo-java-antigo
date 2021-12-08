package Funcionario;

public class Diretor extends Funcionario {
	public boolean autentica(int senha) {
		return true;
	}

	@Override
	double getBonificacao() {
		return 0;
	}
}
