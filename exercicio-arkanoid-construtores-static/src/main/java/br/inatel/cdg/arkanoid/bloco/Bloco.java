package br.inatel.cdg.arkanoid.bloco;

public class Bloco {

    static int blocosCriados;
    static int blocosDestruidos;

    public static int getBlocosCriados() {
        return blocosCriados;
    }

    public static int getBlocosDestruidos() {
        return blocosDestruidos;
    }

    public static void constroiBloco(int qtd) {
        Bloco.blocosCriados += qtd;
    }

    public static void setBlocosDestruidos(int blocosDestruidos) {
        Bloco.blocosDestruidos += blocosDestruidos;
    }
}
