public class SentenciaFor {
    public static void main(String[] args) {

        // La primera seccion se ejecuta una sola en vez en todo el ciclo de vida del for.
        // La segunda seccion se evalua al comienzo de cada iteracion.
        // La tercera seccion se ejecuta al final de cada bloque de iteracion.
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i); // Bloque de iteracion
        }

        System.out.println();

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }

        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println();
        // Delaracion y asignacion fuera de la primera seccion del for.
        int j = 0;
        for (; j < 5; j++) {
            System.out.println("j = " + j);
        }
        System.out.println("j = " + j);

        System.out.println();

        /*Declaracion y asignacion fuera de la primera seccion del for.
          Condicion dentro de la estructura del for.
          Incremento dentro de la estructura del for.
          No es recomendable utilizar esta forma*/
        int k = 0;
        for (; ; ) {
            if (k >= 5) {
                break;
            }
            System.out.println("k = " + k);
            k++;
        }

    }
}
