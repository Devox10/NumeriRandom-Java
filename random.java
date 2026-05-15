// importazione libreria 'java.util'

import java.util.Random;

public class random {

// metodo principale della classe(main)

    public static void main(String[] args) {

        int num;

        // funzione per generare numero random

        Random random = new Random();
        num = random.nextInt(100);
        
        // stampa numero generato
        
        System.out.println(num);

    }
}