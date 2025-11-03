package practica16;
import java.util.*;
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        int numero;

        System.out.print("Introduce el mes para ver sus dias: ");
        numero = sc.nextInt();

        while(numero <= 0 || numero > 12){
            System.out.print("ERROR: El numero debe ser mayor a 0 y menor o igual a 12. Introduce el mes para ver sus dias: ");
            numero = sc.nextInt();
        }

        switch (array[numero - 1]){
            case 1:
                System.out.println("ENERO: 1 - 31");
                break;
            case 2:
                System.out.println("FEBRERO: 1 - 28 o 29");
                break;
            case 3:
                System.out.println("MARZO: 1 - 31");
                break;
            case 4:
                System.out.println("ABRIL: 1 - 30");
                break;
            case 5:
                System.out.println("MAYO: 1 - 31");
                break;
            case 6:
                System.out.println("JUNIO: 1 - 30");
                break;
            case 7:
                System.out.println("JULIO: 1 - 31");
                break;
            case 8:
                System.out.println("AGOSTO: 1 - 31");
                break;
            case 9:
                System.out.println("SEPTIEMBRE: 1 - 30");
                break;
            case 10:
                System.out.println("OCTUBRE: 1 - 31");
                break;
            case 11:
                System.out.println("NOVIEMBRE: 1 - 30");
                break;
            case 12:
                System.out.println("DICIEMBRE: 1 - 31");
                break;
        }
    }
}
