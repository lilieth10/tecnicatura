//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // EJERCICIO 8.1 de clase 8 Operadores Unarios
        // Operadores Unarios: cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);// el resultado sera un numero negativo

        // operador de negacion
        var varC = true; // esta literal por default en Java es tipo boleana
        var varD = !varC; // invertimos el valor

        // Operadores Unarios de Incremento: preincremento
        var varE = 9; // se va a modificar su valor
        var varF = ++varE; // Simbolo antes de la variable
        // primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);// se incrementa en la unidad
        System.out.println("varF = " + varF);// va a sumar uno

        // Postincremento (el simbolo va despues dela variable)
        var varG = 3;
        var varH = varG++;// primero el valor de la variable luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);// la variable ya esta con decremento
        System.out.println("varJ = " + varJ);

        // postdecremento
        var varK = 8;
        var varL = varK--;// primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varK); // Aqui va a decrementar en 1
        System.out.println("varL = " + varL);

        // EJERCICIO 8.2, 8.3 y 8.4 de Clase 8
        // operador de Igualdad, relacionales y condicionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        // ahora vemos relacionales
        var gVar = aNum != bNum; // >< >= <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");
        }

        var age = 15;
        var adulto = 18;
        if (age >= adulto) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
        // Un ejemplo de un operador and dentro de un condicional
        var valorA = 7;
        var valorMinimo = 0;// rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("esta dentro del rango establecido");
        } else {
            System.out.println("esta fuera del rango establecido");
        }
        // un ejemplo con operador OR dentro de una estructura condicional
        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) {
            System.out.println("papa puede asistir al juego de su hijo");
        } else {
            System.out.println("papa no puede asistir al juego de su hijo");
        }

        // Operador Ternario, sirve para simplificar la estructura condicional IF
        // se recomienda utilizar cuando la complejidad condicional no sea compleja
        var resultadoT = (5 > 8) ? "verdadero" : "falso"; // esta estructura se evalua de la siguiente manera
        // Si dada una condicion entre () entonces sera ? primer argumento sino con :
        // sera segundo argumento
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultadoT = " + resultadoT);
    }
}