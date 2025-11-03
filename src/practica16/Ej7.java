package practica16;
import java.util.*;
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] salas = new int[15];
        int opcion = 0, sala;

        while (opcion != 4) {
            System.out.println("1) Reservar sala: ");
            System.out.println("2) Liberar sala: ");
            System.out.println("3) Listar sala: ");
            System.out.println("4) Salir: ");
            System.out.print("->");
            opcion = sc.nextInt();
            System.out.println("**********************************" + "\n");

            switch (opcion) {
                case 1:
                    System.out.print("¿Qué sala desea reservar?(1-15): ");
                    sala = sc.nextInt();

                    while (sala < 1 || sala > 15) {
                        System.out.println("ERROR: Esa sala no existe, intentelo de nuevo (1-15): ");
                        sala = sc.nextInt();
                    }

                    if (salas[sala] == 0) {
                        salas[sala] = 1;
                        System.out.println("Sala reservada");
                    }else  {
                        System.out.println("Sala esta reservado");
                    }
                    System.out.println("**********************************" + "\n");
                    break;
                case 2:
                    System.out.println("¿Qué reserva desea liberar?(1-15): ");
                    sala = sc.nextInt();

                    while (sala < 1 || sala > 15) {
                        System.out.println("ERROR: Esa sala no existe, intentelo de nuevo (1-15): ");
                        sala = sc.nextInt();
                    }

                    salas[sala] = 0;
                    System.out.println("Sala liberada.");
                    System.out.println("**********************************" + "\n");
                    break;
                case 3:
                    for (int i = 0; i < salas.length; i++) {
                        if (salas[i] == 0) {
                            System.out.println("Sala " + (i + 1) + " libre.");
                        }else {
                            System.out.println("Sala " + (i + 1) + " esta reservado.");
                        }
                    }
                    System.out.println("**********************************" + "\n");
                    break;
            }
        }

        System.out.println("!!Gracias por confiar en nuestro servicio¡¡" + "\n" +
                "Hasta pronto.");
    }
}
