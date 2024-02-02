public class PasarPorReferencia1 {
    public static void main(String[] args) {

        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main\n");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("antes de llarmar al metodo test");

        test(edad);

        System.out.println("despues de llamar al metodo test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }

        System.out.println("\nfinaliza el metodo main con los datos del arreglo modificado");
    }

    public static void test(int[] edad) { // Se pasa un argumento por referencia, se trabaja con esta
        System.out.println("\niniciamos el metodo test");
        for (int i = 0; i < edad.length; i++) {
            edad[i] += 20;
        }
        System.out.println("finaliza el metodo test\n");
    }
}
