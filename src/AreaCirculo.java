import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");

        try {
            double rad = sc.nextDouble();
            double area = Math.PI * Math.pow(rad, 2);
            System.out.println("el area es = " + area);

        } catch (InputMismatchException e) {
            System.out.println("Solo puede ingresar numeros");
            main(args);
            System.exit(0);
        }

    }

}
