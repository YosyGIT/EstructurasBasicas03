package practica15;

public class Ej2 {
    public static void main(String[] args) {
        double[] array = new double[10];
        double[] arrayInvertido = new double[10];
        int posicion = 9;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * (10 - 1 + 1) + 1;
            arrayInvertido[i] = array[i];
            System.out.print(array[i] + "\t");
        }
        System.out.println();

        for (int j = 0; j < arrayInvertido.length; j++) {
            array[j] = arrayInvertido[posicion];
            posicion--;
            System.out.print(array[j] + "\t");
        }
    }
}
