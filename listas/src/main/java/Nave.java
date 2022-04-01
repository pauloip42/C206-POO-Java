public class Nave {
    public static int cont = 0;
    public int vida;
    private int numNaves;
    private String nome;

    public Nave() {
        this.vida = 100;
        cont++;
    }

    public Nave(String nome){
        this.nome = nome;
        this.numNaves++;
    }

    public void mostraInfo(){
        System.out.println(vida);
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void trocavida(Nave nave) {
        this.vida = nave.getVida();
        nave.setVida(this.vida);
    }


//    private String nome;
//    private int vida;
//
//    public Nave(String nome, int vida) {
//        this.nome = "Nave";
//        this.vida = 70;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public int getVida() {
//        return vida;
//    }
//
//    public void setVida(int vida) {
//        this.vida = vida;
//    }
}
