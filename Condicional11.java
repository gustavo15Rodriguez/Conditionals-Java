/*
 * 46. Leer un número entero de 2 dígitos y si termina en 1 mostrar en pantalla 
 * su primer dígito, si termina en 2 mostrar en pantalla la suma de sus dígitos 
 * y si termina en 3 mostrar en pantalla el producto de sus dos dígitos.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional11 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero positivo de dos digitos:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/10;
        int dig2 = num%10;
        
        int suma = dig1 + dig2;
        int mult = dig1 * dig2;
        
        if (num > 9 && num < 100)
        {
            
            if (dig2 == 1)
            {
                System.out.println(dig1);
            }
            
            else if (dig2 == 2)
            {
                System.out.println(suma);
            }
            
            else if (dig2 == 3)
            {
                System.out.println(mult);
            }
            
            else
                System.out.println("Dado que el numero anteriormenente ingresado "
                        + " no termina en 1, 2 0 3; no se realiza ninguna "
                        + "instruccion al respespecto.");
        }
        
        else
            System.out.println("El numero ingresado debe ser de dos digitos y "
                    + "positivo.");
    }
    
}
