class TesteEmpresa {
    public static void main(String[] args){
        Empresa empresa = new Empresa();
        empresa.cnpj = "1213213131";
        empresa.empregados = new Funcionario[2];
        
        Funcionario f1 = new Funcionario();
        f1.nome = "Matheus";
        f1.salario = 200000.00;
        f1.cpf = "04312419108";
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Ana";
        f2.salario = 5000.00;
        f2.cpf = "12348684";
        
        empresa.adicionarFuncionario(f1);
        //empresa.adicionarFuncionario(f2);
        //empresa.mostraTodasAsInformações();
        
        empresa.contem(f2);
    }
}