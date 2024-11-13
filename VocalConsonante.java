/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalconsonante;

/**
 *
 * 
 */
import java.util.Scanner;

public class VocalConsonante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println("Ingresa una letra (presione 'q' para salir): ");
        
        while (true) {
            System.out.print("Ingresa una letra: ");
            ch = scanner.next().toLowerCase().charAt(0); 
            
     
            if (ch == 'q') {
                System.out.println("Programa terminado.");
                break;
            }


            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " es una vocal.");
            } else { 
                
                System.out.println(ch + " es una consonante.");
            }
        }
    }
}
