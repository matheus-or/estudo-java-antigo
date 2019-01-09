class TesteEmpresa {
    public static void main(String[] args){
        Empresa novaEmpresa = new Empresa(10);

        Data novaData = new Data();
        novaData.setData(31, 2, 2012);

        Funcionario novoFuncionario1 = new Funcionario("Matheus Oliveira Rodrigues", "GTI", 50000.0, novaData, "12131321321");
        Funcionario novoFuncionario2 = new Funcionario("Ana Carolina", "GTI", 5000.0, novaData, "1213121");
        Funcionario novoFuncionario3 = new Funcionario("Pedro", "GTI", 5000.0, novaData, "1213121");

        //novaEmpresa.empregados[0] = novoFuncionario1;
        //novaEmpresa.empregados[1] = novoFuncionario2;
        //novaEmpresa.empregados[2] = novoFuncionario3;

        //novaEmpresa.empregados[0].mostra();
        //novaEmpresa.empregados[1].mostra();
        //novaEmpresa.empregados[2].mostra();

        // Aplicar o set Funcionario[] empregados
        //novaEmpresa.setFuncionario(0, novoFuncionario1);

    }
}