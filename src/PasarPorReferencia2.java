class Persona {

    private String nombre;

    public void modificarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String leerNombre() {
        return this.nombre;
    }

}


public class PasarPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Josue");
        System.out.println("iniciamos el metodo main\n");

        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("antes de llarmar al metodo test");
        test(persona);
        System.out.println("despues de llamar al metodo test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("\nfinaliza el metodo main con los datos de la persona modificada");
    }

    public static void test(Persona persona) { // Se pasa un argumento por referencia, se trabaja con esta
        System.out.println("\niniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("finaliza el metodo test\n");
    }
}
