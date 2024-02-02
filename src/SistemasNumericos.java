import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        // Pasar de binario a decimal se agrega 0b
        int numeroBinario = 0b111110100;
        System.out.println("numero binario a decimal = " + numeroBinario);

        // Pasar de octal a decimal se agrega 0
        int numeroOctal = 0764;
        System.out.println("numero octal a decimal = " + numeroOctal);

        // Pasar de hexadecimal a decimal se agrega 0x
        int numeroHexa = 0x1f4;
        System.out.println("numero hexadecimal a decimal = " + numeroHexa);

        String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal) + "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal) + "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
