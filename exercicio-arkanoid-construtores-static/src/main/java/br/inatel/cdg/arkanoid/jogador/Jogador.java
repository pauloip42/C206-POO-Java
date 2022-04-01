package br.inatel.cdg.arkanoid.jogador;

import br.inatel.cdg.arkanoid.bloco.Bloco;

public class Jogador {
    static int pontos;

    public static void aumentaPontos(int pontos){
        Jogador.pontos += pontos;
    }

    public static int getPontos() {
        return pontos;
    }

    public static void destroiBloco(int qtd) {
        Bloco.setBlocosDestruidos(qtd);
        Jogador.aumentaPontos(qtd);
    }
}
