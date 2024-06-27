//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // EJERCICIO 7.1 - CLASE 7 - Operadores aritmeticos
        int num1 = 5;
        int num2 = 6;
        // operacion suma
        var suma = num1 + num2;
        System.out.println("resultado suma = " + suma);
        // operacion resta
        var resta = num2 - num1;
        System.out.println("resultado resta = " + resta);
        // operacion division
        var division = num2 / num1;
        System.out.println("resultado división = " + division);
        // operacion multiplicacion
        var multiplicacion = num1 * num2;
        System.out.println("resultado multiplicacion = " + multiplicacion);
        // operacion modulo o residual
        var modulo = num2 % num1;
        System.out.println("resultado del modulo = " + modulo);

        // Clase 7 - Ejercicio 7.2 Operadores de Asignacion
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3" + varNum3);

        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);

        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);

        varNum1 *= 5;
        System.out.println("varnum1 = " + varNum1);

        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);

        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
    }

}