import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        double descuento, precioFinal, compra;

        System.out.println("Digite la cantidad a pagar");
        compra = entrada.nextDouble();
        if (compra > 100){
            descuento = compra * 0.2;
        }
        else{
            descuento = 0;
            precioFinal = compra - descuento;
            System.out.println("El precio a pagar es : "+ precioFinal);
        }
    }
}
