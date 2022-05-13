package aula1.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Abstrata> lista = new ArrayList<>();

        Abstrata instancia1 = new Filha1("first", 30);
        Abstrata instancia2 = new Filha2("second", 1000);

        lista.add(instancia1);
        lista.add(instancia2);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).texto);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).inteiro);
        }
        Collections.sort(lista);

        System.out.println("Ordenada: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).inteiro);
        }
    }
}
