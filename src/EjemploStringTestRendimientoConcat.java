public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 -> 3ms, 1000 -> 6ms, 100000 -> 6028ms
            // c += a + b + "\n"; // 500 -> 19ms, 1000 -> 21ms, 100000 -> 2352ms
            // sb.append(a).append(b).append("\n"); // 500 -> 0ms, 1000 -> 0ms, 100000 -> 11ms
        }

        /*
        concat, mientras menos iteraciones tenga sera mejor, pero si hay mas iteraciones sera peor.
        operador +, mientras menos iteracioens tenga sera peor, pero si hay mas iteraciones sera mejor.
        StringBuilder, bueno ya sea que tenga pocas o muchas iteraciones.
         */

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

    }

}
