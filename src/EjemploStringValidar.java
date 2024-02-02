public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " ";
        }

        boolean esVacio1 = curso.isEmpty(); // Verifica que este vacio
        boolean esVacio2 = curso.isBlank(); // Verifica que sea null, que tenga espacios en blanco y que sea vacio

        if (!esVacio1) {
            System.out.println("No estoy vacio 1");
        } else {
            System.out.println("Si estoy vacio 1");
        }

        if (!esVacio2) {
            System.out.println("No soy blanco 1");
        } else {
            System.out.println("Son blanco 1");
        }

        System.out.println("Bienvenido al curso ".concat(curso)); // Genera error, si obj = null
        System.out.println("Bienvenido al curso " + curso); // Sí concatena, ya que convierte null en cadena.

    }
}
