/*
 * 28. Leer un número entero menor que 50 y positivo y determinar
 * si es un número primo.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero positivo menor a 50:");
        
        int num = entrada.nextInt();
        
        if (num<=50 && num>=1)
        {
            if (num == 2 || num == 3 || num == 5 || num == 7 || num == 11 || 
               num == 13 || num == 17 || num == 19 || num == 23 || 
               num == 29 || num == 31 || num == 37 || num == 41 || num == 43)
            {
              System.out.println("El numero ingresado es un numero primo");  
            }
            
            else
                System.out.println("El numero ingresado no es un numero primo");
        }
        
        else
            System.out.println("El numero ingresado debe ser positivo y menor"
                    + "de 50.");
    }
}
