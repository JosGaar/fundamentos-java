import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        System.out.print("Ingrese una fecha con el formato dd-MM-yyyy: ");
        try {
            Date fecha1 = df.parse(sc.next());
            System.out.println("fecha1 = " + fecha1);
            System.out.println("df = " + df.format(fecha1));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha1.after(fecha2)) {
                System.out.println("\nfecha1 (del usuario) es mayor o despues que la fecha2 (fecha actual) ");
            } else if (fecha1.before(fecha2)) {
                System.out.println("\bfecha1 es anterior o menor que fecha2");
            } else if (fecha1.equals(fecha2)) {
                System.out.println("\nfecha1 es igual a fecha 2");
            }

            if (fecha1.compareTo(fecha2) > 0) {
                System.out.println("\nfecha1 (del usuario) es mayor o despues que la fecha2 (fecha actual) ");
            } else if (fecha1.compareTo(fecha2) < 0) {
                System.out.println("\bfecha1 es anterior o menor que fecha2");
            } else if (fecha1.compareTo(fecha2) == 0) {
                System.out.println("\nfecha1 es igual a fecha 2");
            }


        } catch (ParseException e) {
            System.out.println("Error del tipo" + e.getMessage());
            main(args);
            System.exit(0);
        }


    }
}
