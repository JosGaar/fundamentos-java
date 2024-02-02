import java.util.Scanner;
public class DetalleFactura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la factura: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese un precio: ");
        double precio1 = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese otro precio: ");
        double precio2 = Double.parseDouble(sc.nextLine());

        double precioSinImpuesto = (precio1 + precio2);
        double impuesto = precioSinImpuesto*(0.19);
        double precioConImpuesto = precioSinImpuesto + impuesto;

        String mensaje = "Nombre de la factura " + nombre + "\nMonto total bruto: " + precioSinImpuesto + "\nImpuesto: " + impuesto + "\nMonto total neto: " + precioConImpuesto;
        System.out.println(mensaje);

    }
}
