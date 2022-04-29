package exercicio2;

public class Main {
    public static void main(String[] args) {
        Lontra lontra = new Lontra("Lontrinha", 1000);
        Cachorro cachorro = new Cachorro("Doguinho",10000 );
        Boi boi = new Boi("Boi", 10000);

        lontra.emitirSom();
        lontra.mostraInfo();

        boi.emitirSom();
        boi.mostraInfo();

        cachorro.emitirSom();
        cachorro.mostraInfo();
    }
}
