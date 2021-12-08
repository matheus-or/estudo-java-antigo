class Empresa {

    Funcionario[] empregados;
    String cnpj;
    int livre = 0;
        
    void adicionarFuncionario(Funcionario f){
    this.empregados[this.livre] = f;
    this.livre++;
            
    }
    
    void mostraEmpregados() {
        for (int i = 0; i < this.empregados.length; i++) {
            System.out.println("Funcionário na posição: " + i);
            this.empregados[i].mostra();
            
        }
    }
    
    void mostraTodasAsInformações() {
        System.out.println("CNPJ da empresa: " + this.cnpj);
        this.mostraEmpregados();
        
    }
    
    boolean contem(Funcionario f) {
        for (int i = 0; i < this.empregados.length; i++) {
            if (f == this.empregados[i]){
                return true;
            }
        }
        return false;
    }    
}    
