public class Ejercicio4 {
    public static void main(String[] args) {
        // Clase 4 - Ejercicio 3.2 - Tipos Enteros
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short:" + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Short:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Short:" + Integer.MAX_VALUE);

        long numEnteroLong = 10;
        System.out.println("numEnteroInt = " + numEnteroLong);
        System.out.println("Valor mínimo del Short:" + Long.MIN_VALUE);
        System.out.println("Valor máximo del Short:" + Long.MAX_VALUE);

        // Clase 4- Ejercicio 3.3
        float numFloat = (float) 3.4028236E38D;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de float:" + Float.MIN_VALUE);
        System.out.println("El valor máximo de float:" + Float.MAX_VALUE);

        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor mínimo de double" + Double.MIN_VALUE);
        System.out.println("El valor máximo de double" + Double.MAX_VALUE);

    }
}