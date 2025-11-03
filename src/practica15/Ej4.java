package practica15;
import java.util.*;
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array = new int [20];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 9);
        }
    }
}
