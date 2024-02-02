public class EjemploString {
    public static void main(String[] args) {

        String curso1 = "Programacion Java";
        String curso2 = new String("Programacion Java");
        String curso3 = "Programacion Java";
        String curso4 = new String("Programacion Java");
        
        boolean esIgual = curso1 == curso2;
        System.out.println("curso1 == curso2 = " + esIgual);

        esIgual = curso1 == curso3;
        System.out.println("curso1 == curso3 = " + esIgual);
    
        esIgual = curso2 == curso4;
        System.out.println("curso2 == curso4l = " + esIgual);
    }

}
