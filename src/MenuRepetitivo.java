import java.util.Scanner;

public class MenuRepetitivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\tMenu");
        int opcion = 0;

        do {
            String mensaje = "1. Actualizar" + "\n2. Eliminar" + "\n3. Agregar" + "\n4. Listar" + "\n5. Salir";
            System.out.println(mensaje);
            System.out.print("Seleccione alguna opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Ingrese solo numeros enteros\n");
                main(args);
                System.exit(0);
            }

            switch (opcion) {
                case 1:
                    System.out.println("Actualizado correctamente.\n");
                    break;
                case 2:
                    System.out.println("Eliminado correctamente.\n");
                    break;
                case 3:
                    System.out.println("Agregado correctamente.\n");
                    break;
                case 4:
                    System.out.println("Listado mostrado correctamente.\n");
                    break;
                case 5:
                    System.out.println("Haz salido con exito.\n");
                    break;
                default:
                    System.out.println("Opcion no existente.\n");
            }
        } while (opcion != 5);



    }
}
