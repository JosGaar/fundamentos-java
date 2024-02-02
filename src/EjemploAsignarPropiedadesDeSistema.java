import java.io.FileInputStream;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties"); // Agregamos config.properties a un objeto
            Properties props = new Properties(System.getProperties());
            props.load(archivo); // Cargamos el archivo que tiene las configuraciones de propiedades en un objeto de tipo Properties
            props.setProperty("mi.propiedad.personalizada", "mi valor personalizado"); // Podemos establecer una propiedad directamente con un metodo
            System.setProperties(props); // Establecemos las propiedades a System

            Properties ps = System.getProperties(); // Traemos las propiedades de System y la almacenamos en un objecto
            System.out.println("ps.getProperty() = " + ps.getProperty("config.puerto.servidor")); // Traemos una propiedad nuestra

            // Como System ya esta actualizada con las propiedades, utilizamos directamente la clase y el metodo getProperty
            System.out.println("System.getProperty() = " + System.getProperty("config.puerto.servidor"));

            ps.list(System.out); // Mostramos todas las propiedades

        } catch (Exception e) {
            System.err.println("Error del tipo " + e);
            System.exit(1);
        }

    }
}
