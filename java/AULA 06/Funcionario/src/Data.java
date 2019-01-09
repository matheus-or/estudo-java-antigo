class Data{
    private int dia;
    private int mes;
    private int ano;

    public void setData(int novoDia, int novoMes, int novoAno){
        this.dia = novoDia;
        this.mes = novoMes;
        this.ano = novoAno;
    }
    public String getDataFormatada(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}