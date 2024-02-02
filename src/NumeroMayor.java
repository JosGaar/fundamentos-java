import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        int[] numeros = new int[10];
        int menor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + " - ");
            numeros[i] = Integer.parseInt(sc.nextLine());

        }

        int variableAnterior = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            variableAnterior = numeros[i + 1];
            if (numeros[i] < variableAnterior) {
                variableAnterior = numeros[i];
            }
        }

        if (variableAnterior > 10) {
            System.out.println("el numero menor es igual o mayor que 10 = " + variableAnterior);
        } else {
            System.out.println("el numero menor es menor que 10 = " + variableAnterior);
        }
    }
}
