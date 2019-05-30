/*
 * 17. Leer un número entero de tres dígitos y determinar en qué posición 
 * está el mayor dígito.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional19 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de tres digitos:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/100;
        int dig2 = (num/10) % 10;
        int dig3 = num%10;
        
        if (num > 99 && num < 1000) {
            
            if (dig1 == dig2 && dig1 == dig3) {
                
                System.out.println("Todos los digitos del numero anterior son "
                        + "iguales.");
            }
            
            else if (dig1 > dig2 && dig1 > dig3) {
                
                System.out.println("El primer digito del numero ingresado es "
                        + "el digito mayor.");
            }
            
            else if (dig2 > dig1 && dig2 > dig3) {
                
                System.out.println("El segundo digito del numero ingresado es "
                        + "el digito mayor.");
            }
            
            else
                System.out.println("El tercer digito del numero ingresado es "
                        + "el digito mayor.");
        }
        
        else 
            System.out.println("El numero ingresado debe ser de tres digitos "
                    + "y positivo.");
    }
    
}
