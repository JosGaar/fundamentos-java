import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "negro"};


        double random = Math.random();
        System.out.println("random = " + random);

        // Indice para los elementos del arreglo
        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        // Usando la clase Random
        Random randonObj = new Random();

        int randomInt = randonObj.nextInt(6);
        System.out.println("randomInt = " + randomInt);

        System.out.println("coloers = " + colores[randomInt]);

        long semilla = 123456789L;
        Random randomConSemilla = new Random(semilla);
        System.out.println("randomConSemilla = " + randomConSemilla);
        
    }
}
