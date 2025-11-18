package practica19;
import java.util.*;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String NOMBRE = ".*[A-Za-zÑn].*";
        final String APELLIDOS = ".*[A-Za-zÑn].*";
        final String EDAD = ".*[0-9].*";
        String csv;

        System.out.println("nombre,apellidos,edad");
        System.out.print("Introduce los datos en el formato que se indica: ");
        csv = sc.nextLine();

        if (csv.matches(NOMBRE)) {}

        while(!csv.equalsIgnoreCase("salir")){
            System.out.println("--Si deseas salir, escribelo--");
            System.out.print("Introduce los datos en el mismo formato que antes: ");
            csv = sc.nextLine();
        }
    }
}
