public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = -128;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de un byte " + Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("\nnumeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de un short " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("\nnumeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de un int " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("\nnumeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un long " + Long.MAX_VALUE);
        System.out.println("valor minimo de un long " + Long.MIN_VALUE);



    }
}
