package practica16;
import java.util.*;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[][] ventanillas = new int[9][];
        int generadorVentanillas = 0, generadorTicket = 1, opcion  = 0;
        int taquilla;

        //creamos las ventanillas
        for (int i = 0; i < 9; i++) {
            ventanillas[i] = new int[generadorVentanillas];
            generadorVentanillas++;
        }

        while(opcion != 3){
            System.out.println("1) Sacar número de ticket");
            System.out.println("2) Lista de tickets actuales");
            System.out.println("3) Salir ");
            System.out.print("->");
            opcion = sc.nextInt();
            System.out.println("**********************************" + "\n");

            switch (opcion) {
                case 1:
                    for (int i = 0; i < ventanillas.length; i++) {

                    }

                    System.out.print("Introduce el numero de taquilla:");
                    taquilla = sc.nextInt();

                    ventanillas[taquilla] = new int[generadorTicket];
                    ventanillas[taquilla][0] = generadorTicket;
                    generadorTicket++;

                    System.out.println("Ventanilla " + ventanillas[taquilla][generadorTicket] + ", número de ticket " + ventanillas[taquilla][generadorTicket]);
                    break;
                case 2:

                    break;
            }
        }
    }
}
