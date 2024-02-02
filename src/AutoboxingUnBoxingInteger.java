public class AutoboxingUnBoxingInteger {
    public static void main(String[] args) {

        // Autoboxing
        Integer[] enteros = {1,2,3,4,5};

        int suma = 0;

        for(Integer i : enteros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }

        System.out.println("suma = " + suma);

        // Unboxing explicitamente
        suma = 0;
        for(Integer i : enteros) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        // Unboxing implicitamente
        System.out.println("suma = " + suma);

    }
}
