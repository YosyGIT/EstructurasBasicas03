package practica19;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fecha;
        String dia;
        String mes;
        String year;

        System.out.print("Introduce la fecha: ");
        fecha = sc.nextLine();

        //08/11/2001

        dia = fecha.substring(0,2);
        mes = fecha.substring(3,5);
        year = fecha.substring(6,10);

        System.out.println(dia + mes + year);

        if (fecha.matches("([01][0-9]/[0][1-9]/([0-9]){4})|([2][0-9]/[0][1-9]/([0-2][0-9][0-9][0-9]))")){

        }
    }
}
