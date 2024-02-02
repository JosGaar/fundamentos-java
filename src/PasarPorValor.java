public class PasarPorValor {
    public static void main(String[] args) {

        Integer i = 10;
        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con i = " + i);
    }

    public static void test(Integer i) { // Se pasa un argumento por valor, se crea una copia
        System.out.println("iniciamos el metodo test con i = " + i);
        i = 35; // Es otra instancia
        System.out.println("finaliza el metodo test con i = " + i);
    }
}
