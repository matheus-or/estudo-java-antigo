class Empresa {

	String nome;
	Funcionario[] empregados;
	String cnpj;
	int livre = 0;

	void adicionar(Funcionario f){

		this.empregados[this.livre] = f;
		this.livre++;
	}

	void mostraEmpregados() {

		for (int = 0; i < this.empregados.length; i++) {
			System.out.println("AULA05.Funcionario na posição: " + i);
		}
	}
}

class Funcionario{

	int salario;

	void mostra() {

		System.out.println("Salario         : " + this.salario);
	}
}

class TestaEmpresa {
	
	public static void main(String[] args){

		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];
		
		Funcionario f1 = new Funcionario();
		f1.salario = 1000;

		Funcionario f2 = new Funcionario();
		f2.salario = 2000;

		empresa.adicionar(f1);
		empresa.adicionar(f2);

		empresa.empregados[0].mostra();
		empresa.empregados[1].mostra();
	}
}