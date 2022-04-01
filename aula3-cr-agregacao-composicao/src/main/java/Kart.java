public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart() {
        motor = new Motor();
        /*
            Em um composição, o atributo deve ser instanciado no construtor
            Isso garante que ele será instanciado no momento da construção da classe*?
         */
    }

    void pular(){
        System.out.println("Pulou");
    }

    void soltarTurbo(){
        System.out.println("Turbo");
    }

    void fazerDrift(){
        System.out.println("Drift");
    }
}
