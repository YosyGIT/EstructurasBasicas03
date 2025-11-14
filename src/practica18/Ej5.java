package practica18;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] array;
        String texto;
        byte repeticiones = 1, comprobar = 0;
        boolean mostrar = false;
        char caracter = 'Z';

        System.out.print("-Introduce el texto: ");
        texto = in.nextLine();
        texto = texto.toLowerCase();
        array = new char[texto.length()];
        array = texto.toCharArray();
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++){
            mostrar = false;
            
            for (int j = i; j < array.length; j++){
                if (array[i] == texto.charAt(i)){
                    repeticiones++;
                } else if (array[i] != texto.charAt(i)) {
                    mostrar = true;
                    i = comprobar;
                    caracter = array[i];
                }
                comprobar++;
            }
            
            if (repeticiones != 1 && mostrar){
                System.out.println(caracter + " " + repeticiones + " veces");
            }
            repeticiones = 1;
        }
    }
}
