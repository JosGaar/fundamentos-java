import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = varEnv.get("Path");
        System.out.println("path = " + path);

        String hola = varEnv.get("SALUDAR_HOLA"); // Varariable de ambiente creada
        System.out.println("hola = " + hola);

        System.out.println("---------Listando variables de entorno o ambiente del sistema---------");
        for (String key : varEnv.keySet()) {
            System.out.println(key + " -> " + varEnv.get(key));
        }

    }
}
