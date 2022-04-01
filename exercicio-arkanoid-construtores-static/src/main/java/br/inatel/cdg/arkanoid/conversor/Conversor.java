package br.inatel.cdg.arkanoid.conversor;

import br.inatel.cdg.arkanoid.jogador.Jogador;

public class Conversor {
    static int moedas;

    public static int conversao(){
        int pontos = Jogador.getPontos();
        Conversor.moedas = pontos*100;
        return Conversor.moedas;
    }
}
