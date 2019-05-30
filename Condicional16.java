/*
 * 12. Leer dos números enteros de dos dígitos y determinar si tienen dígitos comunes.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional16 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero de dos digitos:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero de dos digitos:");
        
        int num2 = entrada.nextInt();
        
        if (num1> 9 && num1 < 100 && num2 > 9 && num2 < 100) {
            
            if (num1/10 == num2/10 && num1%10 == num2%10) {
                System.out.println("Ambos numeros poseen todos sus digitos en"
                        + " comun");
            }
            
            else if (num1/10 == num2%10) {
                System.out.println("Los numeros si poseen digitos en comun.");
            }
            
            else if (num1%10 == num2/10) {
                System.out.println("Los numeros si poseen digitos en comun.");
            }
            
            else if (num1/10 == num2/10) {
                System.out.println("Los numeros si poseen digitos en comun.");
            }
            
            else if (num1%10 == num2%10) {
                System.out.println("Los numeros si poseen digitos en comun.");
            }
            
            else 
                System.out.println("Los numeros anteriormente ingresados no "
                        + "poseen digitos en comun.");
        }
        
        else
            System.out.println("Ambos numeros deben ser de dos digitos y "
                    + "positivos.");
    }
    
}
