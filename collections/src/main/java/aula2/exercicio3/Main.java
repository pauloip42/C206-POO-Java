package aula2.exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        long tempoI;
        long tempoF;
        long tempo;
        int tamanho = 100000;

        ArrayList<Integer> listaArray = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<Integer>();
        Map<Integer, Integer> listaMap = new HashMap<Integer, Integer>();
        
        //ARRAY LIST

        System.out.println("ESCRITA");

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            
            listaArray.add(i);
        }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("ARRAY LIST: " + tempo);

        //HASH SET

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            hashSet.add(i);
        }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("HASH SET: " + tempo);

        // HASH MAP

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            listaMap.put(i,i);
        }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("HASH MAP: " + tempo);
        System.out.println("");

        // LEITURA:

        //ARRAY LIST
        System.out.println("LEITURA");

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            listaArray.contains(i);
        }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("ARRAY LIST: " + tempo);

        //HASH SET

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            hashSet.contains(i);
        }
        // for (Integer inteiro : hashSet) {
            
        // }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("HASH SET: " + tempo);

        //MAP

        tempoI = System.currentTimeMillis();
        for (int i = 0; i < tamanho; i++) {
            listaMap.containsKey(i);
        }
        tempoF = System.currentTimeMillis();
        // for (Integer inteiro : hashSet) {
        // }
        tempoF = System.currentTimeMillis();

        tempo = tempoF - tempoI;
        System.out.println("HASH MAP: " + tempo);
    }
}
