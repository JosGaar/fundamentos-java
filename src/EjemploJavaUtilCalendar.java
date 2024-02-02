import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        calendario.set(2020, Calendar.DECEMBER,25,18,20,10);
        calendario.set(Calendar.YEAR, 2021);
        calendario.set(Calendar.MONTH, Calendar.JANUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 23);
        // calendario.set(Calendar.HOUR_OF_DAY, 21); // Hora del dia sin am o pm, de 0hrs a 24hrs. En el SimpleDateFormat se usa HH
        calendario.set(Calendar.HOUR, 7); // Hora del dia, desde 0hrs a 12hrs. En el SimpleDateFormat se usa hh
        calendario.set(Calendar.AM_PM, Calendar.PM); // Se indica si es am o pm
        calendario.set(Calendar.MINUTE, 12);
        calendario.set(Calendar.SECOND, 20);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);
        
        SimpleDateFormat df = new SimpleDateFormat("EEEE - dd/MMMM/yyyy - hh:mm:ss a");
        String fechaConFormato = df.format(fecha);
        System.out.println("fecha con formato = " + fechaConFormato);

    }
}
