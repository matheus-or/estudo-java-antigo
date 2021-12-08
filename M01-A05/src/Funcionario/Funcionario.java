package Funcionario;

class Empresa {
	String cnpj;
	Funcionario[] funcionarios;
}



class Funcionario {
	String nome;
	String cpf;
	double salario;
	Data dataDeEntrada;

	void mostra() {
		System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.salario);
		System.out.println(this.dataDeEntrada.mostraData());

	}
}

class Data {

	int dia;
	int mes;
	int ano;

	void adicionarData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	String mostraData() {
		return this.dia + "/" + this.mes + "/" + this.ano;

	}
}

class TesteFuncionario {
	public static void main(String[] args){

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome    = "Matheus Oliveira Rodrigues";
		funcionario1.cpf     = "04312419108";
		funcionario1.salario = 5000.00;
		funcionario1.dataDeEntrada = new Data();
		funcionario1.dataDeEntrada.adicionarData(05, 12, 1992);
		funcionario1.mostra();

		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome    = "Ana Carolinha Magalhaes Bastos";
		funcionario2.cpf     = "4564654654";
		funcionario2.salario = 5000000.00;
		funcionario2.dataDeEntrada = new Data();
		funcionario2.dataDeEntrada.adicionarData(13, 07, 1996);
		funcionario2.mostra();
		
	}
}