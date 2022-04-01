package br.inatel.cdg.jogador;

import br.inatel.cdg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getTipoTiro() {
        return tipoTiro;
    }

    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro) {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        String tipoAst = ast.getTipoAsteroide();
        if(tipoAst.equals("Grande")){
            if(this.tipoTiro.equals("Explosivo")){
                ast.destruir();
            }
        }else
            ast.destruir();

    }
}
