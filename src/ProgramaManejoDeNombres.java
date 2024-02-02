import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.print("Ingrese un nombre: ");
        String var1 = sc.nextLine();

        System.out.print("Ingrese otro nombre: ");
        String var2 = sc.nextLine();

        System.out.print("Ingrese un tercer nombre: ");
        String var3 = sc.nextLine();

        char ch1 = var1.toUpperCase().charAt(1);
        char ch2 = var2.toUpperCase().charAt(1);
        char ch3 = var3.toUpperCase().charAt(1);

        String str1 = ch1 + "." + var1.substring(var1.length() - 2).concat("_");
        String str2 = ch2 + "." + var2.substring(var2.length() - 2).concat("_");
        String str3 = ch3 + "." + var3.substring(var3.length() - 2);

        String strFinal = str1.concat(str2).concat(str3);
        System.out.println("strFinal = " + strFinal);

    }
}
