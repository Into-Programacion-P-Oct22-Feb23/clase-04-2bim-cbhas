package ejemplos02;

public class Ejemplo05 {

    // aquí globales
    public static void main(String[] args) {

        int suma = 100;
        obtenerSuma(10, 30); // se invoca al método (procedimiento) obtenerSuma // 40
        System.out.println(suma); // 100

    }

    public static void obtenerSuma(int a, int b) {
        int suma;
        suma = a + b; // 10 + 30 // 40
        System.out.printf("El valor de la suma es: %d\n", suma);

    }

}
