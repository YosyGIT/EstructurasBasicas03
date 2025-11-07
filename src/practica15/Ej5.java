package practica15;

public class Ej5 {
    public static void main(String[] args) {
        byte[] array = {1,2,3,4,5,5,4,3,2,1};
        int repeticiones = 0, centro = array.length / 2;

        for (byte i = 0, j = 9; i < centro; i++, j--) {
            if (array[i] == array[j]) {
                repeticiones++;
            }
        }

        if (repeticiones == centro) {
            System.out.print("El numero [");
            for (int capicua : array){
                System.out.print(capicua);
            }
            System.out.print("] es capicúa.");
        }else {
            System.out.print("El numero [");
            for (int capicua : array){
                System.out.print(capicua);
            }
            System.out.println("] no es capicúa");
        }
    }
}
