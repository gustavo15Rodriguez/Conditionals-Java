/*
 * 49. Leer un número entero y si es múltiplo de 4 determinar
 * si su último dígito es primo.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero deseado que sea positivo:");
        
        int num = entrada.nextInt();
        
        if (num > 0) 
        {
            
            if (num%4 == 0 && num%10 == 2 || num%10 == 3 || num%10 == 5 || num%10 == 7)
            {
                System.out.println("El numero ingresado es multiplo de 4  y "
                        + "ademas es un numero primo.");
            }
            
            else if (num%4 == 0 && num%10 != 2 || num%10 != 3 || num%10 != 5 || num%10 != 7)
            {
                System.out.println("El numero ingresado es multiplo de 4, pero "
                        + " su ultimo digito no equivale a un numero primo.");
            }
            
            else
                System.out.println("Ya que el numero ingresado no es multiplo de "
                        + "4, no se puede evaluar si el ultimo digito de "
                        + "dicho numero es un numero primo.");
        }
        
        else
            System.out.println("El numero ingresado debe ser positivo:");
    }
    
}
