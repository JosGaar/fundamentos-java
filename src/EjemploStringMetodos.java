public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Andres";

        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.substring() = " + nombre.substring(2));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1));
        System.out.println("nombre.substring(4,6) = " + nombre.substring(4,6));

        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace(\"ab\",\"e\") = " + trabalenguas.replace("a","e"));
        System.out.println("trabalenguas.replace(\"tra\",\"ma\") = " + trabalenguas.replace("tra","ma"));
        System.out.println("trabalenguas.indexOf(\"ba\") = " + trabalenguas.indexOf("ba"));
        System.out.println("trabalenguas.indexOf(\"bxa\") = " + trabalenguas.indexOf("bxa"));
        System.out.println("trabalenguas.lastIndexOf(\"u\") = " + trabalenguas.lastIndexOf('u'));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("   trabalenguas   ");
        System.out.println("   trabalenguas   ".trim());
    }
}
