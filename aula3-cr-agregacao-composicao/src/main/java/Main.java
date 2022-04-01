public class Main {
    public static void main(String[] args) {

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

//        Motor motor = new Motor();
//        System.out.println(motor);

        k1.piloto = p1;
        k2.piloto = p2;

//        k1.piloto = new Piloto();
//        k2.piloto = new Piloto();

        k1.nome = "Relampago";
        k1.piloto.nome = "Toreto";
        k1.piloto.vilao = false;
        //p1.nome
        //p1.vilao

        k1.motor.cilindradas = "100";
        k1.motor.velocidadeMaxima = 100;

        k2.nome = "Trovoada";
        k2.piloto.nome = "Vader";
        k2.piloto.vilao = true;
        k2.motor.cilindradas = "50";
        k2.motor.velocidadeMaxima = 30;

        k1.motor.mostraInfo();
        k2.motor.mostraInfo();
    }
}
