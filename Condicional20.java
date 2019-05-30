/*
 * 18. Leer un número entero de tres dígitos y determinar si algún dígito 
 * es múltiplo de los otros.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de tres digitos, positivo:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/100;
        int dig2 = (num/10) % 10;
        int dig3 = num%10;

        
        if (num > 99 && num < 1000) {
            
            if (dig1%dig2 == 0 && dig1%dig3 == 0) {
                
                System.out.println("El primer digito es multiplo de todos los "
                        + " digitos.");

            }
            
            else if (dig2%dig1 == 0 && dig2%dig3 == 0) {
                
                System.out.println("El segundo digito es multiplo de todos los "
                        + " digitos.");

            }
            
            else if (dig3%dig1 == 0 && dig3%dig2 == 0) {
                
                System.out.println("El tercer digito es multiplo de todos los "
                        + " digitos.");

            }
            
            else if (dig1%dig2 == 0 && dig1%dig3 != 0) {
                
                System.out.println("El primer digito es multiplo del segundo.");

            }
            
            else if (dig1%dig3 == 0 && dig1%dig2 != 0) {
                
                System.out.println("El primer digito es multiplo del tercero.");

            }
            
            else if (dig2%dig1 == 0 && dig2%dig3 != 0) {
                
                System.out.println("El segundo digito es multiplo del primero.");

            }
            
            else if (dig2%dig3 == 0 && dig2%dig1 != 0) {
                
                System.out.println("El segundo digito es multiplo del tercero.");

            }
            
            else if (dig3%dig1 == 0 && dig3%dig2 != 0) {
                
                System.out.println("El tercer digito es multiplo del primero.");

            }
            
            else if (dig3%dig2 == 0 && dig3%dig1 != 0) {
                
                System.out.println("El tercer digito es multiplo del segundo.");

            }
            
            else
                System.out.println("Ninguno de los digitos es multiplo entre si.");
        }
        
        else 
            System.out.println("El numero ingresado debe ser de tres digitos "
                    + "y positivo.");
    }
    
}
