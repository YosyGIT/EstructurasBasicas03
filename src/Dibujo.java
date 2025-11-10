import java.util.Scanner;
public class Dibujo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[15][70];
        int opcion = 1, xTortuga = 0, yTortuga = 0;
        int xCaracter = 0, yCaracter = 0;
        boolean pinto = false, borro = false;
        char auxCaracater;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '·';
            }
        }
        array[xTortuga][yTortuga] = 'X';

        while (opcion != 0) {
            System.out.println("0) Salir");
            System.out.println("1) Bajar lápiz");
            System.out.println("2) Subir lápiz");
            System.out.println("3) Bajar goma");
            System.out.println("4) Subir goma");
            System.out.println("5) Mover arriba");
            System.out.println("6) Mover abajo");
            System.out.println("7) Mover izquierda");
            System.out.println("8) Mover derecha");
            System.out.print("->");
            opcion = sc.nextInt();

            while (opcion < 0 || opcion > 8){
                System.out.println("Opcion invalida, elija una opcion: ");
                opcion = sc.nextInt();
            }

            if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {
                for (char[] fila: array){
                    for (char caracter: fila){
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
            }

            switch (opcion) {
                case 1:
                    if (borro){
                        borro = false;
                    }
                    pinto = true;
                    break;
                case 2:
                    pinto = false;
                    break;
                case 3:
                    if (pinto) {
                        pinto = false;
                    }
                    borro = true;
                    break;
                case 4:
                    borro = false;
                    break;
                case 5:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (xTortuga == 0) {
                        System.err.println("LIMITE ENCONTRADO: No se puede subir en el tablero.");
                    } else if(pinto){
                        xTortuga--;
                        xCaracter = xTortuga + 1;
                        array[xCaracter][yTortuga] = (char)(0x2588);
                        array[xTortuga][yTortuga] = 'X';
                    } else if (borro) {
                        xTortuga--;
                        xCaracter = xTortuga + 1;
                        array[xCaracter][yTortuga] = '·';
                        array[xTortuga][yTortuga] = 'X';
                    } else {
                        xTortuga--;
                        xCaracter = xTortuga + 1;
                        auxCaracater = array[xTortuga][yTortuga];
                        array[xCaracter][yTortuga] = auxCaracater;
                        array[xTortuga][yTortuga] = 'X';

                    }
                    break;
                case 6:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (xTortuga == 14) {
                        System.err.println("LIMITE ENCONTRADO: No se puede bajar en el tablero.");
                    } else if(pinto){
                        xTortuga++;
                        xCaracter = xTortuga - 1;
                        array[xCaracter][yTortuga] = (char)(0x2588);
                        array[xTortuga][yTortuga] = 'X';
                    } else if (borro) {
                        xTortuga++;
                        xCaracter = xTortuga - 1;
                        array[xCaracter][yTortuga] = '·';
                        array[xTortuga][yTortuga] = 'X';
                    } else {
                        xTortuga++;
                        xCaracter = xTortuga - 1;
                        auxCaracater = array[xTortuga][yTortuga];
                        array[xCaracter][yTortuga] = auxCaracater;
                        array[xTortuga][yTortuga] = 'X';
                    }
                    break;
                case 7:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (yTortuga == 0) {
                        System.err.println("LIMITE ENCONTRADO: No se puede mover a la izquierda en el tablero.");
                    } else if (pinto){
                        yTortuga--;
                        yCaracter = yTortuga + 1;
                        array[xTortuga][yCaracter] = (char)(0x2588);
                        array[xTortuga][yTortuga] = 'X';
                    } else if (borro) {
                        yTortuga--;
                        yCaracter = yTortuga + 1;
                        array[xTortuga][yCaracter] = '·';
                        array[xTortuga][yTortuga] = 'X';
                    } else {
                        yTortuga--;
                        yCaracter = yTortuga + 1;
                        auxCaracater = array[xTortuga][yTortuga];
                        array[xTortuga][yCaracter] = auxCaracater;
                        array[xTortuga][yTortuga] = 'X';

                    }
                    break;
                case 8:
                    System.out.println((pinto?"Lapiz abajo":"Lapiz arriba") + (borro?", Goma abajo":", Goma arriba"));
                    if (yTortuga == 69) {
                        System.err.println("LIMITE ENCONTRADO: No se puede mover a la derecha en el tablero.");
                    } else if (pinto){
                        yTortuga++;
                        yCaracter = yTortuga - 1;
                        array[xTortuga][yCaracter] = (char)(0x2588);
                        array[xTortuga][yTortuga] = 'X';
                    } else if (borro) {
                        yTortuga++;
                        yCaracter = yTortuga - 1;
                        array[xTortuga][yCaracter] = '·';
                        array[xTortuga][yTortuga] = 'X';
                    } else {
                        yTortuga++;
                        yCaracter = yTortuga - 1;
                        auxCaracater = array[xTortuga][yTortuga];
                        array[xTortuga][yCaracter] = auxCaracater;
                        array[xTortuga][yTortuga] = 'X';
                    }
                    break;
            }

        }

    }
}