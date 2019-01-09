class TesteContaBancaria {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000.0;
        minhaConta.limite = 1000.0;
        minhaConta.saca(50000); // saldo + limite é só 2000!!
        
        Cliente meuCliente = new Cliente();
        
    }
}
