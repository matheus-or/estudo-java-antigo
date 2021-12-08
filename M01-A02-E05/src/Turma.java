class Conta {
    int saldo;
}

class TesteConta {
    public static void main(String[] args) {

        Conta[] minhasContas;
        minhasContas = new Conta[10];

        Conta contaNova;
        contaNova = new Conta();

        contaNova.saldo = 500; //Atribuindo valor.

        minhasContas[0] = contaNova; //Atribuindo a um endereço de array

        minhasContas[1] = new Conta();

        minhasContas[1].saldo = 3200;


        for (Conta n : minhasContas) {

            System.out.println(n.saldo);
        }
    }
}