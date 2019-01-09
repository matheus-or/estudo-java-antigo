class Empresa{
    private Funcionario[] empregados;
    private String nome;
    private String cnpj;
    private int livre = 0;

    public Empresa(int num){
        this.empregados = new Funcionario[num];
    }
    public void setEmpresaNome(String novoNome){
        this.nome = novoNome;
    }
    public String getEmpresaNome(){
        return this.nome;
    }
    public void setCnpj(String novoCnpj){
        this.cnpj = novoCnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public Funcionario getFuncionario (int posicao) {
        return this.empregados[posicao];
    }

    public Funcionario setFuncionario(int posicao, ) {
        this.Funcionario[posicao] = ;
    }
}