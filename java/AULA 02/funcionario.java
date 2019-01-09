class Empresa {

	String nome;
	Funcionario[] empregados;
	String cnpj;
	int livre = 0;

	void adicionar(Funcionario f){

		this.empregados[this.livre] = f;
		this.livre++;
	}
}

class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;

	void recebeAumento(double valor){

		double novoSalario = this.salario + valor;
		
		this.salario = novoSalario;
	}

	double calculaGanhoAnual() {

	double ganhoAnual = this.salario * 12;

	return ganhoAnual;

	}

	void mostra() {

		System.out.println("Nome            : " + this.nome);
		System.out.println("Departamento    : " + this.departamento);
		System.out.println("Salario         : " + this.salario);
		System.out.println("Data de Entrada : " + this.dataDeEntrada.getFormatada());
		System.out.println("RG              : " + this.rg);
		System.out.println("Ganho Anual     : " + this.calculaGanhoAnual());
	}
}

class Data {

	int dia;
	int mes;
	int ano;

	void addData(int dia, int mes, int ano){

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String getFormatada(){

		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario matheus;
		matheus = new Funcionario();
		matheus.dataDeEntrada = new Data();
		matheus.nome          = "Matheus Oliveira Rodrigues";
		matheus.departamento  = "GTI";
		matheus.salario       = 500.00;
		matheus.rg            = "213123131";
		matheus.dataDeEntrada.addData(1, 2, 2017);

		matheus.recebeAumento(300.00);
		matheus.mostra();

		System.out.println(matheus.dataDeEntrada.dia);
	}
}