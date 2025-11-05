package practica15;

public class Ej5 {
    public static void main(String[] args) {
        byte[] array = {1,2,3,4,5,5,4,3,2,1};
        int repeticiones = 0;

        for (byte i = 0, j = 9; i != j; i++, j--) {
            if (array[i] == array[j]) {
                repeticiones++;
            }
        }
    }
}
