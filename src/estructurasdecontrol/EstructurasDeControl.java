/*
Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class EstructurasDeControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el primer número entero
        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();

        // Pedimos al usuario que introduzca el segundo número entero
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Comprobamos si ambos números son mayores que 25
        if (numero1 > 25 && numero2 > 25) {
            System.out.println("Ambos números son mayores que 25");
        }
        // Comprobamos si al menos uno de los números es mayor que 25
        else if (numero1 > 25 || numero2 > 25) {
            System.out.println("Al menos uno de los números es mayor que 25");
        }
        // Si ninguno de los números es mayor que 25, mostramos un mensaje indicándolo
        else {
            System.out.println("Ninguno de los números es mayor que 25");
    }
    
    }
}
