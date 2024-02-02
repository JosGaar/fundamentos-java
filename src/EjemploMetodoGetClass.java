import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!";
        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPak = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        for (Method m : strClass.getMethods()) {
            System.out.println("m.getName() = " + m.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());

        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + objClass);

        for (Method m : objClass.getMethods()) {
            System.out.println("m.getName() = " + m.getName());
        }

    }
}
