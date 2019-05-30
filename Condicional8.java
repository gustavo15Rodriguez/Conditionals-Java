/*
 * 36. Leer un número entero de 4 dígitos y determinar si tiene más 
 * dígitos pares o impares.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional8 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de cuatro digitos; positivo:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/1000;
        int dig2 = (num/100)%10;
        int dig3 = (num/10)%10;
        int dig4 = num%10;
        
        if (num > 999 && num < 10000) 
        {
            if (dig1%2 == 0 && dig2%2 == 0 && dig3%2 == 0 && dig4%2 == 0)
            {
                System.out.println("Todos los digitos del numero anterior "
                        + "son pares");
            }
            
            else if (dig1%2 == 0 && dig2%2 == 0 && dig3%2 != 0 && dig4%2 != 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 != 0 && dig3%2 == 0 && dig4%2 == 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 == 0 && dig3%2 == 0 && dig4%2 != 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 == 0 && dig2%2 != 0 && dig3%2 != 0 && dig4%2 == 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 == 0 && dig3%2 != 0 && dig4%2 == 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 == 0 && dig2%2 != 0 && dig3%2 == 0 && dig4%2 != 0)
            {
                System.out.println("La mitad de los digitos del numero anterior"
                        + " son pares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 != 0 && dig3%2 != 0 && dig4%2 == 0)
            {
                System.out.println("La mayoria de los digitos del numero anterior"
                        + " son impares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 != 0 && dig3%2 == 0 && dig4%2 != 0)
            {
                System.out.println("La mayoria de los digitos del numero anterior"
                        + " son impares.");
            }
            
            else if (dig1%2 != 0 && dig2%2 == 0 && dig3%2 != 0 && dig4%2 != 0)
            {
                System.out.println("La mayoria de los digitos del numero anterior"
                        + " son impares.");
            }
            
            else if (dig1%2 == 0 && dig2%2 != 0 && dig3%2 != 0 && dig4%2 != 0)
            {
                System.out.println("La mayoria de los digitos del numero anterior"
                        + " son impares.");
            }
            
            else
                System.out.println("Todos los digitos del numero anterior son "
                        + "impares.");
        }
        
        else 
            System.out.println("El numero ingresado debe ser de 4 digitos y"
                    + "positivo.");
    }
    
}
