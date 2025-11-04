package practica16;
import java.util.*;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] numeros = new int[60];
        int opcion = 0, numero, contadorArray = 0;

        while(opcion != 2){
            System.out.println("1) Sigueinte numero");
            System.out.println("2) Salir");
            System.out.print("->");
            opcion = sc.nextInt();

            while(opcion != 1 && opcion != 2){
                System.out.println("Opcion invalida, elija una opcion: ");
                opcion = sc.nextInt();
            }

            switch(opcion){
                case 1:
                    System.out.println("************************");

                    for (int i = 0; i < numeros.length ; i++) {
                        numero = (int)(Math.random()*(60 - 1 + 1) + 1);
                        for (int j = 0; j < numeros.length; j++) {
                            if (numeros[j] == numero) {
                                numero = (int)(Math.random()*(60 - 1 + 1) + 1);
                            }
                        }
                        numeros[i] = numero;
                    }

                    System.out.println((contadorArray + 1) + ") numero: " + numeros[contadorArray]);
                    System.out.println("************************");
                    contadorArray++;
                    break;
            }
        }
    }
}
