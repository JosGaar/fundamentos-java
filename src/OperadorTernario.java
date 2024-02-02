import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0d;
        double matematicas = 0.0d;
        double ciencias = 0.0d;
        double historia = 0.0d;

        Scanner sc = new Scanner((System.in));

        System.out.print("Ingresa la nota de matematicas (2.0 - 7.0): ");
        matematicas = Double.parseDouble(sc.nextLine());

        System.out.print("Ingresa la nota de ciencias (2.0 - 7.0): ");
        ciencias =  Double.parseDouble(sc.nextLine());

        System.out.print("Ingresa la nota de historia (2.0 - 7.0): ");
        historia =  Double.parseDouble(sc.nextLine());

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);
        estado = promedio >= 6 ? "aprobado" : "reprobado";
        System.out.println("estado = " + estado);

    }
}
