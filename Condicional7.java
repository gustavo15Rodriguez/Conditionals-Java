/*
 * 44. Leer un número entero de 4 dígitos y determinar si el primer dígito
 * es múltiplo de alguno de los otros dígitos.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional7 {
    
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de cuatro digitos y positivo:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/1000;
        int dig2 = (num/100)%10;
        int dig3 = (num/10)%10;
        int dig4 = num%10;
        
        if (num >=1000 && num <10000)
        {
           if (dig1 % dig2 == 0)
           {
               System.out.println("El primer digito es multiplo del segundo"
                       + " digito del numero leido.");
           }
           
           else if (dig1 % dig3 == 0)
           {
               System.out.println("El primer digito es multiplo del tercer"
                       + " digito del numero leido.");
           }
           
           else if (dig1 % dig4 == 0)
           {
               System.out.println("El primer digito es multiplo del cuarto"
                       + " digito del numero leido.");
           }
           
           else if (dig1 % dig4 == 0 && dig1 % dig3 == 0)
           {
               System.out.println("El primer digito es multiplo del cuarto"
                       + "  y tercer digito del numero leido.");
           }
           
           else if (dig1 % dig2 == 0 && dig1 % dig3 == 0)
           {
               System.out.println("El primer digito es multiplo del segundo"
                       + "  y tercer digito del numero leido.");
           }
           
           else if (dig1 % dig2 == 0 && dig1 % dig4 == 0)
           {
               System.out.println("El primer digito es multiplo del segundo"
                       + "  y cuarto digito del numero leido.");
           }
           
           else if (dig1 % dig2 == 0 && dig1 % dig3 == 0 && dig1 % dig4 == 0)
           {
               System.out.println("El primer digito es multiplo de todos los "
                       + "digitos del numero leido.");
           }
           
           else
               System.out.println("El primer digito no es multiplo de alguno de "
                       + "los digitos del numero leido.");
        }
        
        else
            System.out.println("El numero ingresado debe ser de cuatro digitos"
                    + " y positivo");
    }
}
