public class ConversionDeTipos {
    public static void main(String[] args) {

        // De cadena a primitivo
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "93843.43D";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // De primitivo a cadena
        int otroNumeroInt = 100;
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        otroNumeroStr = String.valueOf(otroNumeroStr);
        System.out.println("\notroNumeroStr = " + otroNumeroStr);;

        double otroRealDouble = 123345.6D;
        String otroRealStr = Double.toString(otroRealDouble);
        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // Conversion entre primitivos compatibles
        int entero = 32768;
        short sh = (short) entero; // Hay perdida de informacion al almacenar un tipo mayor en un tipo menor
        long lg = entero; // No hay perdida de informacion al almacenar un tipo menor en un tipo mayor

        System.out.println("\nsh = " + sh );
        System.out.println("lg = " + lg);

        double db = 13455.23e10D;
        float ft = (float) db;

        System.out.println("\ndb = " + db);
        System.out.println("ft = " + ft);

    }
}
