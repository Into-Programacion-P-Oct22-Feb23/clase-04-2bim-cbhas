package ejemplos01;

import java.util.Scanner;

public class Ejemplo081 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String mensajeSuma;
        String mensajeSumaDos;
        int opcion;

        System.out.println("Ingrese 1, si desea trabajar con la suma\n"
                + "Ingrese 2, si desea trabajar con la multiplicación");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            mensajeSuma = obtenerTablaSumar(10, 9);
            System.out.println(mensajeSuma);
        } else {
            if (opcion == 2) {
                mensajeSumaDos = obtenerTablaMultiplicar(10, 9);
                System.out.println(mensajeSumaDos);

            } else {
                System.out.println("Error\nValor fuera de rango");
            }

        }

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
