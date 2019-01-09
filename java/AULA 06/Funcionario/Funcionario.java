class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private int identificador;
    private static int incIndentificador = 1;

    public Funcionario(String novoDepartamento, double novoSalario, Data novaDataEntrada, String novoRg){
        this.departamento = novoDepartamento;
        this.salario = novoSalario;
        this.dataEntrada = novaDataEntrada;
        this.rg = novoRg;
    }

    public Funcionario(String nome, String departamento, double salario, Data dataEntrada, String rg){
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public Funcionario(){
        this.identificador = incIndentificador;
        incIndentificador++;
    }

    public void setFuncionarioNome(String novoNome){
        this.nome = novoNome;
    }

    public String getFuncionarioNome(){
        return this.nome;
    }

    public void setDepartamento(String novoDepartamento){
        this.departamento = novoDepartamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setSalario(double novoSalario){
        this.salario = novoSalario;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setRg(String novoRg){
        this.rg = novoRg;
    }

    public String getRg(){
        return this.rg;
    }

    public void setDataEntrada(Data novaData){
        this.dataEntrada = novaData;
    }

    public String getDataEntrada(){
        return this.dataEntrada.getDataFormatada();
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    public int getIdentificador(){
        return this.identificador;
    }

    public void mostra(){
        System.out.println("Nome            : " + this.getFuncionarioNome());
        System.out.println("Salario         : " + this.getSalario());
        System.out.println("Departamento    : " + this.getDepartamento());
        System.out.println("RG              : " + this.getRg());
        System.out.println("Data de Entrada : " + this.getDataEntrada());
        System.out.println("Identificador   : " + this.getIdentificador());
    }

}