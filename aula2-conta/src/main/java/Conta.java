public class Conta {

    //Coisas que a Conta (classe) sabe sobre ela
    //membros da classe (o que a classe sabe)
    double saldo;
    double limite;
    int numero;
    String nomeDoDono;

    //o que ela sabe fazer
    //métodos
    void sacar(double quantia) {
        saldo -= quantia;
    }

    void depositar(double quantia) {
        saldo -= quantia;
    }

    void transferir(double quantia, Conta destino) {
        sacar(quantia);
        destino.depositar(quantia);
    }
}
