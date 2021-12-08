package AULA05.ContaBancaria;

class Conta {
    int numero;
    Cliente titular;
    double saldo;
    double limite;
    
    void saca(double valor) {
        this.saldo = this.saldo - valor;

    }
    
    void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
}
