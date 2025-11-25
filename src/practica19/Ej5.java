package practica19;
import java.util.*;
public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fecha;

        int yearEntero;
        String dia, mes, year;
        boolean correcto = false, bisiesto = false;

        System.out.print("Introduce la fecha: ");
        fecha = sc.nextLine();

        dia = fecha.substring(0,2);
        mes = fecha.substring(3,5);
        year = fecha.substring(6,10);

        yearEntero = Integer.parseInt(year);
        bisiesto = (yearEntero % 4 == 0 && yearEntero % 100 != 0) || (yearEntero % 400 == 0);

        if (fecha.matches("(([0-2][1-9])|30|31)/(0[1-9]|1[0-2])/[0-2][0-9]{3}")){
            if (dia.matches("31")){
                if (mes.matches("01|03|05|07|08|10|12")) correcto = true;

            } else if (dia.matches("30")) {
                if (mes.matches("04|06|09|11"))  correcto = true;

            } else if (mes.matches("02")) {
                if (dia.matches("29") && bisiesto){
                    correcto = true;
                }

            }else {
                correcto = true;
            }
        }else {
            System.out.println("ERROR:: Formato de fecha no valido");
        }

        if (correcto) System.out.println("Fecha correcta: " + fecha);
    }
}

