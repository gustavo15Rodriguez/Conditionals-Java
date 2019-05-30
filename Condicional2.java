/*
 * Leer un número entero de tres dígitos y determinar si alguno de sus dígitos es igual a la
 * suma de los otros dos.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional2 {
    
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
    
        System.out.println("Ingrese un numero de tres digitos: ");
        
        int num = entrada.nextInt();
        
        if (num >=100 && num <1000)
        {
            int digito1= num/100;
            int digito2 = (num/10)%10;
            int digito3 = num%10;
            
            if (digito1 + digito2 == digito3)
            {
                System.out.println("La suma de los dos primeros digitos es igual"
                    + " al ultimo digito del numero leido.");
                
            }
            
            else if (digito2 + digito3 == digito1)
               {
                System.out.println("La suma de los dos ultimos digitos es igual"
                    + " al primer digito del numero leido.");
               }
            
            else if (digito1 + digito3 == digito2)
               {
                System.out.println("La suma del primer y ultimo digito es igual"
                    + " al segundo digito del numero leido.");
               }
            
            else
                System.out.println("Ninguna de la suma de los digitos anteriores"
                        + " origina alguno de los digitos del numero leido.");
        }
        
        else 
            System.out.println("El numero ingresado debe ser de tres digitos...");

    }
}