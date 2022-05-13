package aula1.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Double> listaDouble = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listaDouble.add((new Random().nextDouble()*100));
        }

        System.out.println("Antes da Ordenação");

        for (int i = 0; i < listaDouble.size(); i++) {
            System.out.println(listaDouble.get(i));
        }

        Collections.sort(listaDouble, Collections.reverseOrder());

        System.out.println("Depois da ordenação");

        for (int i = 0; i < listaDouble.size(); i++) {
            System.out.println(listaDouble.get(i));
        }
    }
}
