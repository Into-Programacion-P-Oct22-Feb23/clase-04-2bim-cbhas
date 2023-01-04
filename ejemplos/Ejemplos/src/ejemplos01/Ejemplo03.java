package ejemplos01;

import java.util.Scanner;

public class Ejemplo03 {

    public static void main(String[] args) {
        // 
        int valor = obtenerSuma2(10, 30); // se invoca al método 
        // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);

        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }

    public static int obtenerSuma2(int a, int b) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        a = entrada.nextInt();

        System.out.println("Ingrese el valor de b:");
        b = entrada.nextInt();

        int suma;

        suma = a + b;
        return suma;
    }

}