public class OperadoresAsignacion {
    public static void main(String[] args) {

        int i = 5;
        int j = i + 4;

        i += 2; // i = i + 2;
        System.out.println("i = " + i);

        i += 5; // i = i + 5;
        System.out.println("i = " + i);

        i -= 4; // i = i - 4;
        System.out.println("i = " + i);

        i *= 3; // i = i * 3;
        System.out.println("i = " + i);

        i %= 2; // i = i % 2;
        System.out.println("i = " + i);

        String sqlString = "select * from clients as c";
        sqlString += " wherere c.nombre='Andres' ";
        sqlString += "and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
