public class Ejercicio5 {
    public static void main(String[] args) {
        // EJERCICIO 5.1 de CLASE 5 Inferencia de tipos VAR y tipos primitivos
        var numeroEntero = 20;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroFloat = 10.0F;// automaticamente con el punto se transforma en el tipo double
        System.out.println("numeroFloat = " + numeroFloat);

        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        // EJERCICIO 5.2
        char miVariableChar = 'a';// puede alamacenar solo 1 caracter
        System.out.println("miVariableChar = " + miVariableChar);
        // EJERCICIO 5.2

        char varCaracter = '\u0024'; // indicamos a JAVA la asignacion con el codigo unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';// un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        char varCaracter1 = '\u0024'; // indicamos a JAVA la asignacion con el codigo unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        char varCaracterDecimal1 = (char) 36; // sino casteamos char, asigna un valor de tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        char varCaracterSimbolo1 = '$';// un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);

        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);

    }
}
