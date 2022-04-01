public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Banco b1 = new Banco();

        //new Conta() -> tipo concreto
        //Conta c1 -> abstrato
        c1.saldo = 700;
        c1.limite = 100;
        c1.nomeDoDono = "Paulo Lopes";

        c2.saldo = 700;
        c2.limite = 100;
        c2.nomeDoDono = "Lopes Paulo";

        System.out.println("Antes de Transferir");
        System.out.println("Saldo C1: "+ c1.saldo + " Saldo C2: " + c2.saldo);

        c1.transferir(100, c2);

        System.out.println("Depois de transferir");
        System.out.println("Saldo C1: " + c1.saldo + " Saldo C2: "+ c2.saldo);

    }
}
