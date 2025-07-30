package bidimensionales;

import java.util.Random;
import java.util.Scanner;

public class Bidimensionales {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //#1
        int[][] matriz = new int[3][3];
        byte contador = 1;
        for (byte x = 0; x < 3; x++) {
            for (byte y = 0; y < 3; y++) {
                matriz[x][y] = contador;
                contador += 2;
            }
        }
        for (byte x = 0; x < 3; x++) {
            for (byte y = 0; y < 3; y++) {
                System.out.print(matriz[x][y]);
            }
            System.out.println();
        }
        //#2
        /*Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el numero de columnas: ");
        byte columnas = Byte.parseByte(scanner.nextLine());
        int[][] matriz = new int[5][columnas];
        for (byte x = 0; x < 5; x++) {
            for (byte y = 0; y < columnas; y++) {
                matriz[x][y] = random.nextInt(11);

            }
        }
        for (byte x = 0; x < 5; x++) {
            for (byte y = 0; y < columnas; y++) {
                System.out.print(matriz[x][y]);
            }
            System.out.println();
        }*/
        //#3
        
    

    }
}
