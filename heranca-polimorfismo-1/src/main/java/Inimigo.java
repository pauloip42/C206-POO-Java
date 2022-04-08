public class Inimigo {
    protected String nome;
    protected double vida;
    protected String tipoArma;

    public Inimigo(String nome, double vida, String tipoArma) {
        this.nome = nome;
        this.vida = vida;
        this.tipoArma = tipoArma;
    }

    public void atacando(){
        System.out.println("ATACOU");
    }

    public void tomarDano(){
        System.out.println("TOMOU DANO");
    }

    public void mostraInfo();
}
