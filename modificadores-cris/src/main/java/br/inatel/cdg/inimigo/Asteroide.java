package br.inatel.cdg.inimigo;

public class Asteroide {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setTipoAsteroide(String tipoAsteroide) {
        this.tipoAsteroide = tipoAsteroide;
    }

    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide) {
        this.nome = nome;
        this.tipoAsteroide = tipoAsteroide;
    }

    public void destruir() {
        System.out.println("Asteroide " + this.nome + " destruido");
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}
