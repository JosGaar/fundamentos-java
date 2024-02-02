import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha1 = new Date(); // Inicio del tiempo, primera instancia

        System.out.println("fecha = " + fecha1);

        SimpleDateFormat df = new SimpleDateFormat("EEEE - dd/MMMM/yyyy - HH:mm:ss");
        String fechaStr = df.format(fecha1);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date(); // Fin del tiempo, segunda instancia

        long tiempoFinal = fecha2.getTime() - fecha1.getTime();
        System.out.println("tiempo trascurrido en el for = " + tiempoFinal);

    }
}
