class BalancoTrimestral {
	
	public static void main(String[] args){

		int gastosJaneiro   = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco     = 17000;
		int qtdmeses = 3;

		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int mediaMensal = gastosTrimestre / qtdmeses;

		System.out.println(gastosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
	}
}