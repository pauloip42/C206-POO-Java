package exercicio2;

public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
       System.out.println("MUUUUUU");        
    }
    
}
