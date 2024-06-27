//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HolaMundo {
    public static void main(String[] args) {

        System.out.println("Hola mundo, desde java");

        // EJERCICIOS 2.3, 2.5, 2.6 y 2.7 de la CLASE 3
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union - " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + " " + (a + b));
    }
}