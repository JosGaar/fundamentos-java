public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre-incremento
        int i = 1;
        int j = ++i; // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-incremento
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println();
 
        // Pre-decremento
        i = 3;
        j = --i; // i = i - 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        // Post-decremento
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("j = " + j);
    }

}