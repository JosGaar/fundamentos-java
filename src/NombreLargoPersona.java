import javax.swing.*;

public class NombreLargoPersona {
    public static void main(String[] args) {

        String persona1 = JOptionPane.showInputDialog(null, "Ingrese el nombre y apellido de la persona 1");
        String persona2 = JOptionPane.showInputDialog(null, "Ingrese el nombre y apellido de la persona 2");
        String persona3 = JOptionPane.showInputDialog(null, "Ingrese el nombre y apellido de la persona 3");

        String[] name1 = persona1.split(" ");
        String[] name2 = persona2.split(" ");
        String[] name3 = persona3.split(" ");

        int max = name1[0].length() > name2[0].length() ? name1[0].length() : name2[0].length();
        max = max > name3[0].length() ? max : name3[0].length();

        if (name1[0].length() == max) {
            System.out.println(name1[0] + " tiene el nombre mas largo");
        } else if (name2[0].length() == max) {
            System.out.println(name2[0] + " tiene el nombre mas largo");
        } else {
            System.out.println(name3[0] + " tiene el nombre mas largo");
        }

    }
}
