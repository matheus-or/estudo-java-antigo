class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private double limite;
    private static int numeroIncremental = 1;

    public Conta(int numero, double limite) {
        this(numero, limite, 0);
    }

    public Conta(int numero, double limite, double saldoInicial) {
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldoInicial;
    }

    public Conta(){
        this.numero = numeroIncremental;
        numeroIncremental++;
    }

    public static int getTotalDeContas(){
        return Conta.numeroIncremental;
    }

    public void saca(double quantidade) {
        if (quantidade > (this.limite + this.saldo)) {
            System.out.println("Nao existe saldo suficiente.");
        } else {
            this.saldo = this.saldo - quantidade;
            System.out.println("Dinheiro impresso.");
        }
    }

    public int getNumero(){
        return this.numero;
    }

}