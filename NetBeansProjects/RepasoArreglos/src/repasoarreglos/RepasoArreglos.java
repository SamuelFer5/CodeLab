package repasoarreglos;

import java.util.Scanner;
import java.util.Random;

public class RepasoArreglos {

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static int[][] matriz = new int[4][4];//Matriz
    public static boolean matrizLlena = false;//Para que si quiere saltarse el paso 1 que es llenar la matriz
    public static void main(String[] args) {
        while (true) {
            byte menu = Byte.parseByte(validarDatos("===Menu===" + "\n1.Llenar matriz" + "\n2.Suma de una fila" + "\n3.Suma de una columna" + "\n4.Suma de diagonal" + "\n5.Suma diagonal inversa" + "\n6.Media de todos los valores" + "\n7.Salir", "^-?\\d+$", "Error solo debe digitar numeros."));
            if (menu == 7) {
                break;
            }
            mostrarMenu(menu);
        }
    }//Menu principal 
    public static void mostrarMenu(byte menu) {
        switch (menu) {
            case 1:
                llenar();
            case 2:
                if (!matrizLlena) {
                    System.out.println("Debes llenar la matriz primero.");
                    break;
                }
                sumarFilas();
                break;
            case 3:
                if (!matrizLlena) {
                    System.out.println("Debes llenar la matriz primero.");
                    break;
                }
                sumaColumnas();
                break;
            case 4:

                break;
        }
    }//Switch menu de opciones
    public static void llenar() {
        for (byte x = 0; x < 4; x++) {
            for (byte y = 0; y < 4; y++) {
                byte numIngresado = Byte.parseByte(validarDatos("Ingrese un numero para anadir a la matriz: ", "^-?\\d+$", "Error, solo de permiten numeros."));
                matriz[x][y] = numIngresado;

            }
        }
        for (byte x = 0; x < 4; x++) {
            for (byte y = 0; y < 4; y++) {
                System.out.print(matriz[x][y]);
            }
            System.out.println();
        }
        matrizLlena = true;
    }//Llenar la matriz
    public static void sumarFilas() {

        byte fila = Byte.parseByte(validarDatos("Introduce el numero de la fila que quieres sumar (0-3)", "^[0-3]+$", "Error, debes elegir una fila valida."));
        short sumaFila = 0;
        for (short y = 0; y < 4; y++) {
            sumaFila += matriz[fila][y];
        }
        System.out.println("La suma de la fila " + fila + " es de: " + sumaFila);
    }//Sumar las filas
    public static void sumaColumnas(){
    byte columna = Byte.parseByte(validarDatos("Introduce el numero de la fila que quieres sumar (0-3)", "^[0-3]+$", "Error, debes elegir una fila valida."));
    short sumaColumna = 0;
    for (short x = 0; x < 4; x++) {
            sumaColumna += matriz[x][columna];
        }a
        System.out.println("La suma de la columna " + columna + " es de: " + sumaColumna);
    }//Sumar las columnas
    public static String validarDatos(String mensajeEntrada, String patron, String mensajeError) {
        String entrada = "";
        while (true) {
            System.out.println(mensajeEntrada);
            entrada = scanner.nextLine();
            if (entrada.matches(patron)) {
                break;
            } else {
                System.out.println(mensajeError);
            }
        }
        return entrada;
    }//Validacion de los datos
}
