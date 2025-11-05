package practica16;
import java.util.*;
public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int[] numeros = new int[60], numerosSaliendo = new int[60];
        int opcion = 0, numerar = 0, posicion = 0;
        int l, r , guardar;

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = i;
        }

        //Revolver numeros
        for (int j = 0; j < 1000; j++) {
            l = (int) (Math.random() * 60);
            r = (int) (Math.random() * 60);

            guardar = numeros[l];
            numeros[l] =  numeros[r];
            numeros[r] =  guardar;
        }

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

                    System.out.println((numerar + 1) + ") numero: " + numeros[posicion]);
                    System.out.println("************************");
                    numerar++;
                    posicion++;

                    if(posicion == numeros.length){
                        System.out.println("Todos los numeros han salido.");
                    }

                    break;
            }
        }
    }
}
