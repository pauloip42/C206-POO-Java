package aula1.exercicios.exercicio2;

public abstract class Abstrata implements Comparable<Abstrata>{
    String texto;
    int inteiro;

    public Abstrata(String texto, int inteiro) {
        this.texto = texto;
        this.inteiro = inteiro;
    }

    public int compareTo(Abstrata filha) {

        return -1*Integer.compare(this.inteiro, filha.inteiro);
    }
}
