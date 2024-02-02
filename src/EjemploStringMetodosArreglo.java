public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println();

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        int largo2 = arreglo2.length;
        for (int i = 0; i < largo2; i++) {
            System.out.println("arreglo2 = " + arreglo2[i]);
        }

        System.out.println();

        String archivo = "alguna.imagen.pdf";
        System.out.println("archivo.split(\"[.]\") = " + archivo.split("[.]")); // \\.
        String[] archivoArreglo = archivo.split("[.]");
        for (int i = 0; i < archivoArreglo.length; i++) {
            System.out.println("archivoArreglo = " + archivoArreglo[i]);
        }

    }
}
