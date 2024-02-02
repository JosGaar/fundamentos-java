import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador1 = 0, contador2 = 0, contador3 = 0;
        double notas;
        double suma1 = 0, suma2 = 0, suma3 = 0;
        System.out.println("Ingrese 20 notas ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas = sc.nextInt();

            if (notas >= 5.0) {
                contador1++;
                suma1 += notas;
            }

            if (notas <= 4.0) {
                contador2++;
                suma2 += notas;
            }

            if (notas == 1.0) {
                contador3++;
            }

            if (notas == 0.0){
                break;
            }
            suma3 += notas;
        }

        suma1 = suma1 / contador1;
        suma2 = suma2 / contador2;

        String mensaje = "Promedio de las notas mayores a 5: " + suma1 + "\nPromedio de las notas menores a 4: " + suma2 +
                "\nCantidad de notas 1: " + contador3 + "\nPromedio total: " + suma3 / 20;

        System.out.println("mensaje = " + mensaje);

    }
}
