public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println();

        i = 0;
        boolean prueba = true;
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        do {
            System.out.println("\nse ejecuta al menos una vez");
        } while (prueba);

        prueba = true;
        i = 0;
        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);

    }
}
