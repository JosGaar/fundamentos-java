import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner sc = new Scanner((System.in));

        System.out.println("Ingrese un numero");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el numero 2");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Ingrese el numero 3");
        int num3 = Integer.parseInt(sc.nextLine());

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("el numero mayor es = " + max);

    }
}
