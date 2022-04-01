public class Arma {
    String nome, descricao;
    int poder, resistencia;

    void mostraInfoArma(){
        System.out.println("Nome da Arma: " + this.nome + "\nDescrição: " + this.descricao);
        System.out.println("Poder: " + this.poder + "\nResistencia: " + this.resistencia);
    }
}
