public class Main {
    public static void main(String[] args) {
        Ashen ashen = new Ashen();
        Arma arma = new Arma();

        arma.nome = "pá";
        arma.descricao = "Uma pá";
        arma.poder = 10;
        arma.resistencia = 12;

        ashen.vida = 10;
        ashen.nome = "Ashen";
        ashen.arma = arma;

        System.out.println("Informações da Arma: ");
        ashen.arma.mostraInfoArma();

        System.out.println("Vida do Ashen: " + ashen.getVida());
        System.out.println("Resistencia da arma: " + ashen.arma.resistencia);

        System.out.println("Usou a arma\nTomou dano");
        ashen.usarArma();
        ashen.tomarDano();

        System.out.println("Vida do Ashen: " + ashen.getVida());
        System.out.println("Resistencia da arma: " + ashen.arma.resistencia);
    }
}
