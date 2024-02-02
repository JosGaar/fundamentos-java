import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese otro numero: ");
        int num2 = sc.nextInt();
        int resultado = 0;

        for (int i = 0; i < Math.abs(num2); i++) {
            resultado += Math.abs(num1);
        }

        if ((num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0)) {
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("El resultado es: -" + resultado);
        }

    }
}
