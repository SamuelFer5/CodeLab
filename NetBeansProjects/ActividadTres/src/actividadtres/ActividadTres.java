/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadtres;

/**
 *
 * @author samue
 */
import java.util.Scanner;
import java.util.Random;

public class ActividadTres {

    public static final Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    //#3
    /*public static byte[] arreglo;
    public static void main(String[] args) {
        System.out.println("Digite el tamano del arreglo");
        byte tamano = Byte.parseByte(scanner.nextLine());
        
        for (byte x = 0; x < arreglo.length; x++) {
            arreglo[x] = numeroRandomPrimo();
        }
        for (byte numero : arreglo) {
            System.out.println(numero);
        }
    }
    private static byte numeroRandomPrimo() {
        byte numero = 0;
        while (true) {
            numero = (byte) random.nextInt(128);
            if (numero != 0 && numero != 1) {
                if(esPrimo(numero)){
                    
                    }
                }
            }
        }
        return numero;
    }
    private static boolean esPrimo(byte numero){
        boolean estado = true;
        for(byte i =2; i)
        }*/
    //#4
    /*public static void main(String[] args) {
        char[]letras={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String palabra ="";
        while(true){
        System.out.println("Digite una posicion: ");
        byte posicion = Byte.parseByte(scanner.nextLine());
        if(posicion == -1){
            break;
        }
        if(posicion >= 0 && posicion < letras.length){
            palabra +=letras[posicion];
        }else{
           System.out.println("Error solo debes digitar un numero entre 0-25"); 
        }
        }System.out.println(palabra);
        }*/
    //#5
    /*public static void main(String[] args) {
        System.out.println("Digite el tamano del arreglo: ");
        byte [] arreglo = new byte [scanner.nextByte()];
        System.out.println("Ingrese el digito con el que quiere que termine: ");
        byte digito = scanner.nextByte();
        while(true){
            short numero = (short)random.nextInt(1,301);
            String numero = String.valueOf(numero);
            if(numero.){
                
            }
        }
    }*/
    /*public static void main(String[] args) {
        String nombres[] = new String[10];
        String resultados[] = new String[10];
        float notas[] = new float[10];
        for (int x = 0; x < 10; x++) {
            System.out.println("Ingrese el nombre del " + (x + 1) + " estudiante: ");
            nombres[x] = scanner.nextLine();
            float nota = -1;
            while (nota < 0 || nota > 10) {
                System.out.println("Ingrese una nota valida entre 0-10: ");
                String entrada = scanner.nextLine();

                boolean esNumero = true;
                for (int y = 0; y < entrada.length(); y++) {
                    char c = entrada.charAt(y);
                    if ((c < '0' || c > '9') && c != '.') {
                        esNumero = false;
                        break;
                    }
                }
                if (esNumero) {
                    nota = Float.parseFloat(entrada);
                    if (nota < 0 || nota > 10) {
                        System.out.println("La nota debe ser entre 0-10");
                    }
                } else {
                    System.out.println("Solo numeros.");
                }
            }
            notas[x]=nota;
            resultados[x]=result(nota);
        }
        System.out.println("Notas finales");
        for(int o = 0; o < 10; o++){
            System.out.println(nombres[o]+" nota: "+notas[o]+" resultado: "+resultados[o]);
        }
    }
    public static String result(float nota){
        if(nota<5){
            return "Suspenso";
        }else if(nota < 7){
            return "Bien";
        }else if(nota < 9){
            return "Notable";
        }else{
            return "Sobresaliente";
        }
    }*/
    public static void main 



}
