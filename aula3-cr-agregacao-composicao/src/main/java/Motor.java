public class Motor {
    //Posso usar modificadores de acesso para que apenas o Kart possa instanciar um motor
    String cilindradas;
    float velocidadeMaxima;

    void mostraInfo(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
    }

    public void setCilindradas(String cilindradas) {
        if (cilindradas.equals("50")|| cilindradas.equals("100") || cilindradas.equals("150")){
            this.cilindradas = cilindradas;
        }else {
            System.out.println("Cilindradas deve ser: 50, 100 ou 150");
        }
    }

    public void setVelocidadeMaxima(float velocidadeMaxima) {
        if (velocidadeMaxima >= 0 && velocidadeMaxima <= 150){
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade Maxima deve estar entre 0 e 150");
        }
    }
}
