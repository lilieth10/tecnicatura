package leccion03;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera calificacion : ");
        double calificacion1 = entrada.nextDouble();

        System.out.println("Ingrese la segunda calificacion : ");
        double calificacion2 = entrada.nextDouble();

        System.out.println("Ingrese la tercera calificacion : ");
        double calificacion3 = entrada.nextDouble();

        double promedio = ( calificacion1 + calificacion2 + calificacion3);

        if (promedio >= 70){
            System.out.println("El alumno aprueba con un promedio de : "+promedio);

        }
        else {
            System.out.println("El alumno reprueba con un promedio de : "+promedio);

        }
    }
}