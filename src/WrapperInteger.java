public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto;
        int num2 = intObjeto2.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "6700";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjecto = intObjeto2.shortValue();
        System.out.println("shortObjecto = " + shortObjecto);

        Byte byteObjecto = intObjeto2.byteValue();
        System.out.println("byteObjecto = " + byteObjecto);

        Long longObjecto = intObjeto2.longValue();
        System.out.println("longObjecto = " + longObjecto);
    }
}
