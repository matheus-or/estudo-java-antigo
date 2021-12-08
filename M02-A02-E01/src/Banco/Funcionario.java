package Banco;

class Funcionario{
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setCpf(String novoCpf){
        this.cpf = novoCpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }
}