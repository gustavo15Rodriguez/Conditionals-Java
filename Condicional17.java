/*
 * 13. Leer dos números enteros de dos dígitos y determinar si la suma de 
 * los dos números origina un número par.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional17 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero deseado:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero deseado:");
        
        int num2 = entrada.nextInt();
        
        int suma = num1 + num2;
        
        if (num1 > 9 && num1 < 100 && num2 > 9 && num2 < 100) {
            
            if (suma%2 == 0) {
                
                System.out.println("La suma de ambos numeros si origina un "
                        + "numero par.");
            }
            
            else
                System.out.println("La suma de ambos numeros  no origina un "
                        + "numero par.");
        }
        
        else 
            System.out.println("Admbos numeros debens er positivos y de dos"
                    + " digitos.");
    }
}
