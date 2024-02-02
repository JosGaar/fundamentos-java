import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        String[] usernames = new String[2];
        String[] passwords = new String[2];

        usernames[0] = "josue";
        usernames[1] = "admin";

        passwords[0] = "12345";
        passwords[1] = "98765";

        System.out.print("Ingrese el usuario: ");
        String usuario = sc.next();

        System.out.print("Ingrese la contraseña: ");
        String contrasenia = sc.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(contrasenia)) ? true : esAutenticado;
            /* if (usernames[i].equals(usuario) && passwords[i].equals(contrasenia)) {
                esAutenticado = true;
                break;
            } */
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat("Andres.") : "Lo siento, requiere autenticacion.";
        /* if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat("Andres."));
        } else {
            System.out.println("Lo siento, requiere autenticacion.");
        } */
        System.out.println("mensaje = " + mensaje);
    }
}
