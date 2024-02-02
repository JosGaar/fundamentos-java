import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendarCalcularEdad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento");
        String fechaNac = sc.next();

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Fecha usuario
            Date objDate = df.parse(fechaNac);
            Calendar objCalendar = Calendar.getInstance();
            objCalendar.setTime(objDate);

            int anioUsuario = objCalendar.get(Calendar.YEAR);

            System.out.println("anioUsuario = " + anioUsuario);

            // Fecha actual
            Date objActual = new Date();
            Calendar objCalActual = Calendar.getInstance();
            objCalActual.setTime(objActual);

            int anioActual = objCalActual.get(Calendar.YEAR);
            System.out.println("anioActual = " + anioActual);

            // Mostrar edad
            System.out.println("La edad que tienes es: " + (anioActual - anioUsuario));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
