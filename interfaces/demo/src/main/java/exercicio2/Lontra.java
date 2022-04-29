package exercicio2;

public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("Som do Mar");
    }

    @Override
    public void nadar() {
       System.out.println("Lontra " + this.nome + "Está nadando");
    }
    
}
