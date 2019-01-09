class TestaContaEstouro1 {
    public static void main(String[] args){
        Conta minhaConta1 = new Conta();
        Conta minhaConta2 = new Conta();
        Conta minhaConta3 = new Conta();

        int total = Conta.getTotalDeContas();

        minhaConta1.saca(10000.0);
        System.out.println(minhaConta1.getNumero());
        System.out.println(minhaConta2.getNumero());
        System.out.println(minhaConta3.getNumero());



    }
}