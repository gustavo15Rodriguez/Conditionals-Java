/*
 *34. Leer un número entero menor que mil y determinar cuántos dígitos tiene.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero menor que mil y positivo:");
        
        int num = entrada.nextInt();
        
        if (num >=1 && num <1000)
        {
            if (num >=1 && num <10)
            {
                System.out.println("El numero ingresado es de un solo digito.");
            }
            
            else if(num >=10 && num <100)
            {
                System.out.println("El numero ingresado es de dos digitos.");
            }
            
            else
            
                System.out.println("El numero ingresado es de tres digitos.");
            
        }
        
        else
            System.out.println("El numero ingresado debe ser menor a mil y "
                    + "positivo");
        }
}
