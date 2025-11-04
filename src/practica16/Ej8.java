package practica16;
import java.util.*;
public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] ventanillas = {0,1,2,3,4,5,6,7,8,9};
        int[] tickets = new int[10];
        int opcion = 0;
        int ventanilla;

        while(opcion != 3){
            System.out.println("1) Sacar número de ticket");
            System.out.println("2) Lista de tickets actuales");
            System.out.println("3) Salir ");
            System.out.print("->");
            opcion = sc.nextInt();

            while(opcion != 1 && opcion != 2 && opcion != 3){
                System.out.println("Opcion invalida, elija una opcion: ");
                opcion = sc.nextInt();
            }
            System.out.println("**********************************" + "\n");

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el numero de la ventanilla: ");
                    ventanilla = sc.nextInt();
                    while(ventanilla < 0 || ventanilla > 9){
                        System.out.print("ERROR: solo existen del 0 al 9:");
                        ventanilla = sc.nextInt();
                    }
                    System.out.println();

                    if (tickets[ventanilla] == 100) {
                        tickets[ventanilla] = 1;
                    } else if (tickets[ventanilla] < 100) {
                        tickets[ventanilla] = tickets[ventanilla] + 1;
                    }

                    System.out.println("Ticket# " + " ventanilla: " + ventanilla + ": " + "nº " + tickets[ventanilla]);
                    System.out.println("**********************************" + "\n");
                    break;

                case 2:
                    System.out.println("------------TIKETS-------------");

                    for (int i = 0; i < tickets.length; i++) {
                        System.out.println("-------------------------------");
                        System.out.println("Ventanilla " + i + ": " + tickets[i]);
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
