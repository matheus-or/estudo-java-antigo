class Fatorial{
	
	public static void main(String[] args){

		int fat = 20;

		long soma = 1;

		for (int n = 1; n <= fat; n++){

			soma = soma * n;

			System.out.println(soma);
		}
	}
}