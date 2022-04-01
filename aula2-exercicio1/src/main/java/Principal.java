public class Principal {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Zumbi z3 = new Zumbi();

        z1.nome = "Róbison";
        z2.nome = "Volátil";
        z3.nome = "Ironia";

        z1.vida = 100;
        z2.vida = 200;

        boolean x = z1.transfereVida(z2, 10);
        System.out.println(x);

        double vida1 = z1.mostraVida();
        double vida2 = z2.mostraVida();

        System.out.println("Vida "+ z1.nome + ": " + vida1);
        System.out.println("Vida "+ z2.nome + ": " + vida2);
    }
}
