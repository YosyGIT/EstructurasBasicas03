package practica15;

public class Ej1 {
    public static void main(String[] args) {
        int[] array = new int[200];
        int numeracion = 1;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (200 - 1 + 1) + 1);
            System.out.print(numeracion + " " + array[i] + ": ");
            for (int k = 0; k < array[i]; k++) {
                System.out.print("*");
            }
            System.out.println();
            numeracion++;
        }
    }
}
