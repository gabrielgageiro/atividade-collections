/*
Criado por Gabriel Gageiro;
Data:27/04/18
*/


package App;

import java.util.ArrayList;
import java.util.HashSet;

public class TesteDesempenho {
    public static void main(String[] args) {
        System.out.println("Iniciando teste");

        long inicio= System.currentTimeMillis();
        HashSet<Integer> teste = new HashSet<>();

        for (int i=0;i<300000;i++){
            teste.add(i);
        }

        for (int i=0;i<300000;i++){
            teste.contains(i);
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (fim-inicio)/1000.0);

    }
}
