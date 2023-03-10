package ejemplos01;

public class Ejemplo08 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        
        mensajeSuma = obtenerTablaSumar(10, 9);
        mensajeSumaDos = obtenerTablaMultiplicar(10, 9);

        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
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
