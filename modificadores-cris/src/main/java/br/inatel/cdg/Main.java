package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave("Millenium Falcon", 100, "Explosivo");
        Nave nave2 = new Nave("Millenium Falcon", 100, "Normal");


        Asteroide ast1 = new Asteroide("Dinossauro", "Grande");
        Asteroide ast2 = new Asteroide("Formiga", "Pequeno");


        nave1.atirar(ast1);
        nave1.atirar(ast2);

        nave2.atirar(ast1);
        nave2.atirar(ast2);
    }
}
