class Gerente extends Funcionario {
    private int senha;
    int numeroDeFuncionariosGerenciados;

    public void setSenha(int novaSenha) {
        this.senha = novaSenha;
    }

    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }

}