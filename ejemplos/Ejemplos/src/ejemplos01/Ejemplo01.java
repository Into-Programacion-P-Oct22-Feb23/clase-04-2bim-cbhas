package ejemplos01;

public class Ejemplo01 {

    public static void main(String[] args) {

        String cadena = "Loja";
        //String miCiudad = obtenerCiudadMayuscula("Loja");
        //String miCiudad = obtenerCiudadMayuscula(cadena);
        String miCiudad = obtenerCiudadMayuscula("Loja");
        System.out.printf("%s\n", miCiudad);

        String mensaje = obtenerNombre();
        System.out.printf("%s\n", mensaje);

        System.out.println(obtenerNombre());
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

    public static void obtenerMultiplicacion(int tabla, int limite) {

    }

    public static String obtenerNombre() {
        return "Luis";
    }

}
