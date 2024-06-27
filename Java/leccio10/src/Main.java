//estructura if else

import javax.lang.model.SourceVersion;

public class Main {
    public static void main(String[] args) {
        var condicion = false;
        if (condicion) {
            System.out.println("condicion verdadera"); //condicional simple

        } else {
            System.out.println("condicion falsa"); //condicion doble

        }

        var numero = 4;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero uno";

        } else if (numero == 2) {
            numeroTexto = "Numero dos";

        } else if (numero == 3) {
            numeroTexto = "Numero tres";

        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";

        } else {
            numeroTexto = "Numero no encontrado";

        }
        System.out.println("numeroTexto = " + numeroTexto);


    }
}