class TesteEmpresa {
    public static void main(String[] args){
        Empresa novaEmpresa = new Empresa(10);
        //Funcionario[] variosFuncionarios = new Funcionario[10];

        Data novaData = new Data();
        novaData.setData(31, 2, 2012);

        Funcionario novoFuncionario1 = new Funcionario("Matheus Oliveira Rodrigues", "GTI", 50000.0, novaData, "12131321321");
        Funcionario novoFuncionario2 = new Funcionario("Ana Carolina", "GTI", 5000.0, novaData, "1213121");

        //System.out.println(novoFuncionario1.getIdentificador());
        //System.out.println(novoFuncionario2.getIdentificador());


        novaEmpresa.setFuncionario(0, novoFuncionario1);
        novaEmpresa.setFuncionario(1, novoFuncionario2);

        novaEmpresa.getFuncionario[0].mostra();
        novaEmpresa.getFuncionario[1].mostra();
    }
}