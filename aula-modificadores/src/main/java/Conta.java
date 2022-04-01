public class Conta {
    Cliente cliente;
    private double saldo, limite;

    public Conta(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
    }

    //sobrecarga de métodos
    public Conta(){

    }

    void depositar(double quantia){
        saldo += quantia;
    }

    void sacar(double quantia){
        saldo -= quantia;
    }

    //getters e setters

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
}
