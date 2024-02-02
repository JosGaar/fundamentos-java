import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Peta"};
        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if (i == 1 || i == count - 1) {
                continue;
            }
            System.out.println("nombres " + i + " = " + nombres[i]);
        }

        System.out.println();
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombres = " + nombres[i]);
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "No existe en el sistema");
        }

    }
}
