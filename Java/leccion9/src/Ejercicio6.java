import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float guillermo, luis, juan, total;
        System.out.println("Digite la cantidad de dinero de guillermo: ");
        guillermo = Float.parseFloat(entrada.nextLine());

        luis = guillermo / 2;
        juan = (luis + guillermo) / 2;
        total = luis + guillermo + juan;
        System.out.println("\nEl dinero de luis es: u$$ " + luis);
        System.out.println("El dinero de juan es: u$$ " + juan);
        System.out.println("El total de dinero entre los tres es: u$$ " + total);


    }


}
