public class PrimitivoBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.4e-3; // 98.7654
        float f = 1.2345e2f; // 123.45
        datoLogico = d > f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);

    }
}
