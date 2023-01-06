package ejemplos02;

import java.util.Scanner;

public class Ejemplo041 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int primerValor;
        int segundoValor;
        System.out.println("Ingrese el primer valor:");
        primerValor = entrada.nextInt();

        System.out.println("Ingrese el segundo valor:");
        segundoValor = entrada.nextInt();

        obtenerSuma(primerValor, segundoValor);

    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b;
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
