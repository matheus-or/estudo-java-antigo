class Conta{

	int numero;
	String dono;
	double saldo;
	double limite;

	boolean saca(double valor){

		if (this.saldo < valor) {

			return false;
			
		}else{

			this.saldo -= valor;

			return true;
		}
	}

	void deposita(double valor){
		this.saldo += valor;
	}

	boolean transfere(Conta destino, double valor) {
    
        boolean retirou = this.saca(valor);
    
        if (retirou == false) {
            // não deu pra sacar!
            return false;
        }
    
        else {
            destino.deposita(valor);
            return true;
        }
    }
}

class Programa2{

	public static void main(String[] args) {
		// Cria a conta
		Conta minhaConta;

		minhaConta = new Conta();

		Conta meuSonho;

		meuSonho = new	Conta();

		//altera os valores de minhaConta

		minhaConta.dono  = "Matheus Oliveira Rodrigues";
		minhaConta.saldo = 1000.00;

		meuSonho.dono  = "Ana Carolina";
		meuSonho.saldo = 100000.00;


		//saca 200 reais

		minhaConta.saca(200);

		//depositar 500 reais

		minhaConta.deposita(500);

		//Imprimindo resultado;

		
		System.out.println("saldo atual: " + minhaConta.saldo);
		System.out.println("saldo atual: " + meuSonho.saldo);
	}
}