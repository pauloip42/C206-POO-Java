public class Banco {
    Conta contas[];

    void transferir(Conta origem, Conta destino, double quantia){
        origem.saldo -= quantia;
        destino.saldo += quantia;
    }
}
