public class Zumbi {
    //membros da classe
    double vida;
    String nome;
//    boolean fome;
//    double altura;
//    double dano;
//    double velocidade;

    //acoes

    double mostraVida(){
        return vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia){
        if(vida >= quantia) {
            System.out.println("Pode transferir vida");
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        System.out.println("Não pode transferir vida");
        return false;
    }

//
//    void atacar() {
//        System.out.println(this.nome + " atacou!");
//    }
//
//    void gritar(){
//        System.out.println(this.nome + " ararararararaarara");
//    }
//
//    void andar(){
//        System.out.println(this.nome + " devagar e sempre");
//    }
//
//    void correr(){
//        System.out.println(nome + " tékitékitékitékitékitéki");
//    }

}
