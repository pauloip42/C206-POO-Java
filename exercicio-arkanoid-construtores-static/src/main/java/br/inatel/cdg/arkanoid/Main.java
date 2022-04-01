package br.inatel.cdg.arkanoid;

import br.inatel.cdg.arkanoid.bloco.Bloco;
import br.inatel.cdg.arkanoid.conversor.Conversor;
import br.inatel.cdg.arkanoid.jogador.Jogador;

//br.org.nomeDoProjeto
//br.inatel.akanoid
public class Main {
    public static void main(String[] args) {
        Bloco.constroiBloco(10);

        Jogador.destroiBloco(5);

        System.out.println("Pontos: " + Jogador.getPontos());
        System.out.println("Criados: " + Bloco.getBlocosCriados());
        System.out.println("Destruidos: " + Bloco.getBlocosDestruidos());
        System.out.println("Moedas: " + Conversor.conversao());
    }
}
