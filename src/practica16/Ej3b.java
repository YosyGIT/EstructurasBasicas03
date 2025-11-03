package practica16;

import java.util.Locale;
import java.util.Scanner;

public class Ej3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] nombreMes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int numero;

        System.out.print("Introduce el mes para ver sus dias: ");
        numero = sc.nextInt();

        while(numero < 1 || numero >= 12){
            System.out.print("ERROR: El numero debe ser mayor a 0 y menor o igual a 12. Introduce el mes para ver sus dias: ");
            numero = sc.nextInt();
        }

        System.out.println("El mes de " + nombreMes[numero - 1]+ "tiene " + diasMes[numero-1] + " dias.");

    }
}
