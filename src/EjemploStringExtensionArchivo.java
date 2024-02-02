public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.jpg";
        String extensionArchivo = archivo.substring(archivo.lastIndexOf(".") + 1);
        System.out.println("extensionArchivo = " + extensionArchivo);
    }
}
