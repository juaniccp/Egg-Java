/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrol;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = -1; // Inicializamos la variable nota con un valor inválido

        while (nota < 0 || nota > 10) { // Mientras la nota no esté entre 0 y 10, pedimos que se ingrese de nuevo
            System.out.print("Ingresa la nota (entre 0 y 10): ");
            nota = scanner.nextDouble();
        }

        System.out.println("La nota es: " + nota); // Mostramos la nota una vez que es válida
    }
}
