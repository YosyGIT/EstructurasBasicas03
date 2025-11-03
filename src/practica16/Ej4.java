package practica16;

public class Ej4 {
    public static void main(String[] args) {
        int[] array = new int[10000];
        int[] repeticion = new int[6];
        int auxRepeticion;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (6 - 1 + 1) + 1);
        }

        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < repeticion.length; k++) {
                if(array[j] == k + 1){
                    repeticion[k]++;
                }
            }
        }

        for (int i = 0; i < repeticion.length; i++) {
            System.out.print("El numero " + (i + 1) + " aparece " + repeticion[i] + " veces: ");
            auxRepeticion = repeticion[i];
            auxRepeticion /= 100;
            for (int j = 0; j < auxRepeticion; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
