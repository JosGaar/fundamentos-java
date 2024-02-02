public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040';
        char decimal = 64;
        char simbolo = '@';
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("simbolo = " + simbolo);

        System.out.println("char corresponde en bytes: " + Character.BYTES);
        System.out.println("char corresponde en bites: " + Character.SIZE);
        System.out.println("Character.MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: " + Character.MIN_VALUE);

        char espacio = ' ';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("\nPrueba de espacio"  + retornoCarro + nuevaLinea + "........");
        System.out.println("Prueba de espacio " + System.lineSeparator() + "........");

    }
}
