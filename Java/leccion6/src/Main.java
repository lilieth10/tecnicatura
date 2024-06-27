import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EJERCICIOS 6.2 y 6.3 de la CLASE 6

        var edad = Integer.parseInt("32");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor
        var lectura = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(lectura.nextLine());
        System.out.println("edad = " + edad);

        // CLASE 6 - video 6.3
        // Conversión de tipos primitivos en Java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        System.out.println("Digite un caracter: ");
        fraseChar = lectura.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
}