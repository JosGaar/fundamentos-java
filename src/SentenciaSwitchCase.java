import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        /* otra forma que tiene el switch
        switch (opcion) {
            case 1 -> {
                // Bloque de codigo
            }
            case 2 -> {
                // Bloque de codigo
            }
            default -> {
                // Bloque de codigo
            }
        } */

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("Ejemplo numero cero.");
                break;
            case 1:
                System.out.println("Ejemplo numero 1. ");
                break;
            case 2:
                System.out.println("Ejemplo numero 2.");
                break;
            case 3:
                System.out.println("Ejemplo numero 3.");
                break;
            default:
                System.out.println("Caso no encontrado.");
        }

        System.out.print("Ingrese un nombre: ");
        String nombre = sc.next();
        switch (nombre) {
            case "admin":
                System.out.println("Hola admin, bienvenido.");
                break;
            case "josue":
                System.out.println("Hola josue.");
                break;
            case "pepe":
                System.out.println("Hola pepe.");
                break;
            default:
                System.out.println("Usuario desconocido.");
        }

        System.out.print("Ingrese un mes: ");
        int mes = sc.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "marzo";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
            default:
                nombreMes = "indefinido";
        }
        System.out.println("nombreMes = " + nombreMes);

    }
}
