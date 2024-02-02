import com.sun.security.jgss.GSSUtil;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        
        String curso1 = "Programacion Java";
        String profesor = "Andres Guzman";
        String detalle1 = curso1 + " con el instructor " + profesor + " ";

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle1 + numeroA + numeroB);
        System.out.println(detalle1 + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle1);

        String detall2 = curso1.concat(" ".concat(profesor));
        System.out.println("detall2 = " + detall2);
    }

}
