import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nun1, num2, resultado;

        System.out.println("Digite dos numeros : ");
        nun1 = entrada.nextDouble();
        num2 = entrada.nextDouble();

        if (num2 == num2){
            resultado = nun1 * num2;
        } else if (nun1>num2) {
            resultado = nun1 - num2;
            
        }else{
            resultado = nun1 + num2;
        }
        System.out.println("El resultado es : "+ resultado);

    }
}
