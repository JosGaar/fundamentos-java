public class EjemploClaseMath {
    public static void main(String[] args) {

        // Valor absoluto
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // Maximo entre dos numeros
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Minimo entre dos numeros
        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        // Redondear al valor maximo (hacia arrriba, techo) de un numero
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondear al valor minimo (hacia abajo, piso) de un numero
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondea como entero. Mayor o igual a .5 redondea hacia arriba;
        // menor a .5 redondea hacia abajo
        long entero1 = Math.round(3.5);
        System.out.println("entero = " + entero1);

        long entero2 = Math.round(3.4);
        System.out.println("entero = " + entero2);

        // Exponencial = e^x
        double exp = Math.exp(2); // e^2
        System.out.println("exp = " + exp);

        // Logaritmo natural = ln(x)
        double log = Math.log(10); // ln(10)
        System.out.println("log = " + log);

        // Potencia = a^b 
        double potencia = Math.pow(10,3); // 10^3
        System.out.println("potencia = " + potencia);

        // Raiz cuadrada
        double raiz = Math.sqrt(4);
        System.out.println("raiz = " + raiz);

        // Angulo de radianes a grados
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        // Angulo de grados a radinaes
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        // Fuciones trigonometricas - Los angulos estan en radinaes
        System.out.println("seno(90): " + Math.sin(radianes));
        System.out.println("coseno(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("coseno(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("coseno(0): " + Math.cos(radianes));

    }
}
