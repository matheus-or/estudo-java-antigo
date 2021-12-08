class ContaBancaria {
    public static void main(String[] args){
        Conta novaConta = new Conta();
        Conta novaContaCorrente = new ContaCorrente();
        Conta novaContaPoupanca = new ContaPoupanca();
        AtualizadorDeContas novaTaxa = new AtualizadorDeContas(0.10);

        novaConta.setSaldo(5000.00);
        novaContaCorrente.setSaldo(3000.00);
        novaContaPoupanca.setSaldo(2000.00);

        novaConta.atualiza(0.10);
        novaContaCorrente.atualiza(0.10);
        novaContaPoupanca.atualiza(0.10);

        System.out.println(novaConta.getSaldo());
        System.out.println(novaContaCorrente.getSaldo());
        System.out.println(novaContaPoupanca.getSaldo());

        novaConta.deposita(500.00);
        novaContaCorrente.deposita(500.00);
        novaContaPoupanca.deposita(500.00);

        System.out.println(novaConta.getSaldo());
        System.out.println(novaContaCorrente.getSaldo());
        System.out.println(novaContaPoupanca.getSaldo());

        System.out.println("****************************************");
        novaTaxa.roda(novaConta);

        //novaConta.deposita(500.00);
        //System.out.println(novaConta.getSaldo());

        //novaConta.saca(300.00);
        //System.out.println(novaConta.getSaldo());



    }

}