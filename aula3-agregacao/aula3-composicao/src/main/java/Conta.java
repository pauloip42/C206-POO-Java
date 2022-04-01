public class Conta {
    /*
        Agregação: a parte existe sem o t0do
     */


    double saldo, limite;
    Cliente cliente;

    void depositar(double quantia){
        saldo += quantia;
    }

    void sacar(double quantia){
        saldo -= quantia;
    }


}
