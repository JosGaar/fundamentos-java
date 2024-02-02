public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;

        // Autoboxing
        num1 = 1;
        num2 = 2;

        boolean primBoolean1 = num1 > num2; // AutoUnboxing
        Boolean objBoolean1 = Boolean.valueOf(primBoolean1); // Boxing
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true;
        System.out.println("primBoolean1 = " + primBoolean1);
        System.out.println("objBoolean1 = " + objBoolean1);
        System.out.println("objBoolean2 = " + objBoolean2);
        // Independientemente si boolean es primitivo o no, este siempre comparara por su valor.
        System.out.println("comparando dos objetos boolean: " + (objBoolean1 == objBoolean2));
        System.out.println("comparando dos objetos boolean: " + (objBoolean1.equals(objBoolean2)));
        System.out.println("comparando dos objetos boolean: " + (objBoolean2 == objBoolean3));

        boolean primBoolean2 = objBoolean1.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
