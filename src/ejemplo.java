import java.util.*;
public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        char[][]array = new char[20][10];
        int opcion = 0, x = 0, y = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '·';
            }
        }

        while(opcion != 3){
            System.out.println("1) Poner X");
            System.out.println("2) Mostrar");
            System.out.println("3) Salir");
            System.out.print("->");
            opcion = sc.nextInt();

            while(opcion != 1 && opcion != 2 && opcion != 3){
                System.out.println("Opcion invalida, elija una opcion: ");
                opcion = sc.nextInt();
            }

            switch (opcion){
                case 1:
                    x = (int)((Math.random())*10);
                    y = (int)((Math.random())*20);
                    array[x][y] = 'X';

                    break;
                case 2:
                    for(char[] fila: array){
                        for (char caracter: fila){
                            System.out.print(caracter + "\t");
                        }
                        System.out.println();
                    }
            }
        }
    }
}
