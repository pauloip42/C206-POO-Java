import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] campo; //0 - livre; 1 - bomba
        String [][] mostraCampo;

        campo = new int [2][2];
        mostraCampo = new String[2][2];

        int p, q;
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                campo[i][j] = rand.nextInt(2);
                mostraCampo[i][j] = "?";
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Escolha uma posicao no campo: ");
            p = entrada.nextInt();
            q = entrada.nextInt();

            if(campo[p][q] == 1){
                System.out.println("Explodiu");
                mostraCampo[p][q] = "B";
            }else{
                System.out.println("Posicao livre");
                mostraCampo[p][q] = "L";
            }


            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(mostraCampo[j][k]);
                }
                System.out.println("\n");
            }
        }

        System.out.println("Fim do Jogo!");
    }
}
