public class SentenciaForEach {
    public static void main(String[] args) {

        // Solo se utiliza con arreglos
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        System.out.println();

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Peta"};
        for (String obj : nombres) {
            System.out.println("obj = " + obj);
        }
    }
}
