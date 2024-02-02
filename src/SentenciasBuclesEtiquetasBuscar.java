public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra + 1;

        int cantidad = 0;
        char letra = 'g';


        bucle:
        for (int i = 0; i < maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue bucle;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado " + cantidad + " veces el palabra " + palabra + " en la frase");

    }
}
