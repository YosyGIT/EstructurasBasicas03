package practica16;

public class Ej10 {
    public static void main(String[] args) {
        boolean[] primos = new boolean[10000];
        int numerar = 0, reparto = 0;

        for (int i = 2; i < primos.length; i++) {
            primos[i] = true;
        }

        for (int i = 2; (i * i) < primos.length; i++) {
            if (primos[i] == true) {
                for (int j = i; (j * i) < primos.length; j++) {
                    primos[i * j] = false;
                }
            }
        }

        for (boolean listar: primos){
            if (reparto <= 6){
                System.out.print("\t" + numerar + ") " + listar + "\t" + " | ");
                numerar++;
                reparto++;
            }else {
                System.out.println("\t" + numerar + ") " + listar + "\t" + " | ");
                reparto = 0;
            }

        }
    }

}
