public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        
        bucle:
        for (int i = 1; i <= 7; i++) { // Dias
            int j = 1;
            while (j <= 8) { // Horas
                if (i == 6 || i == 7) { // Fin de semana
                    System.out.println("Dia " + i + ": descanso de fin de semana");
                    continue bucle;
                }
                // Lunes a viernes
                System.out.println("Dia " + i + ": trabajando a las " + j + "hrs.");
                j++;
            }
        }

        System.out.println("\n------------------------------------------------------------------------------");

        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n------------------------------------------------------------------------------");

        etiqueta1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

    }
}
