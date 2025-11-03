package practica16;

public class Ej4 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        int[] numeroDado = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (6 - 1 + 1) + 1);
        }

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < numeroDado.length; k++) {
                if(array[j] == k + 1){
                    numeroDado[k]++;
                }
            }
        }

        for (int i = 0; i < numeroDado.length; i++) {
            System.out.print("El numero " + (i + 1) + " aparece " + numeroDado[i] + " veces: ");
            while(numeroDado[i] != 0){
                numeroDado[i] /= 100;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
