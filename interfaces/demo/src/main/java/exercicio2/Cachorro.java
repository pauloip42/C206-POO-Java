package exercicio2;

public class Cachorro extends Mamifero{

    Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("AuAu");       
    }
    
}
