package principiantes;

import java.util.Scanner;

/**
 * Programa de ejemplo que realiza operaciones básicas. Donde los números son
 * leídos desde teclado y establecidos por el usuario.
 * cuyas operaciones filtran la división por 0.
 * 
 * @author Mrrttx
 * @version 1.0
 * @since 2025
 * 
 */
public class OperacionesBasicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¡Vamos a establecer valores para los números!");

        // Pedimos el primer número
        System.out.println("Dime el primer número:");
        double num1 = sc.nextDouble();

        // Pedimos el segundo número
        System.out.println("Dime el segundo número");
        double num2 = sc.nextDouble();

        System.out.printf("Se van a relaizar todas las operaciones de los números %.2f y %.2f", num1, num2);
        // Suma
        System.out.printf("%nSUMA: %.2f%n", (num1 + num2));
        // Resta
        System.out.printf("RESTA: %.2f%n", (num1 - num2));
        // Multiplicación
        System.out.printf("MULTIPLICACIÓN: %.2f%n", (num1 * num2));
        // división
        if (num2 != 0) {
            System.out.printf("DIVISIÓN: %.2f%n", (num1 / num2));
        } else {
            System.out.println("No se puede realizar la división entre 0 :(");
        }

    }
}
