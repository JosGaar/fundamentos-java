public class PrimitivosReales {
    public static void main(String[] args) {

        float realFloat1 =  2.12e3F; // e = 10 // 2120.0F;
        float realFloat2 = 2.12e-3F; // 0.00212
        System.out.println("realFloat = " + realFloat1);
        System.out.println("realFloat = " + realFloat2);
        System.out.println("float corresponde en bytes a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("valor maximo de un float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de un float = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38D;
        System.out.println("\nrealDouble = " + realDouble);
        System.out.println("double corresponde en bytes a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("valor maximo de un double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de un double = " + Double.MIN_VALUE);

        var varFlotante = 3.1416F;
        System.out.println("\nvarFlotante = " + varFlotante);
    }
}
