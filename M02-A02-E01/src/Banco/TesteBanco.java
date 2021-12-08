package Banco;

class TesteBanco {
    public static void main(String[] args){
        ControleDeBonificacoes novoControle = new ControleDeBonificacoes();

        Gerente novoGerente = new Gerente();
        novoGerente.setNome("Matheus Oliveira");
        novoGerente.setCpf("1123456");
        novoGerente.setSalario(5000.00);
        novoGerente.setSenha(12345679);
        novoGerente.autentica(12345679);


        Funcionario novoFuncionario1 = new Funcionario();
        novoFuncionario1.setSalario(5000.00);

        System.out.println(novoGerente.getBonificacao());
        System.out.println(novoFuncionario1.getBonificacao());

        novoControle.registra(novoGerente);
        novoControle.registra(novoFuncionario1);

        System.out.println(novoControle.getTotalDeBonificacoes());
    }
}