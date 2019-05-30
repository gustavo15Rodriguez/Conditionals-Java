/*
 * 10. Leer un número entero de dos dígitos y determinar si los dos
 * dígitos son iguales.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional14 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de dos digitos:");
        
        int num = entrada.nextInt();
        
        if (num>9 && num <100) 
        {
            if (num/10 == num%10)
            {
                System.out.println("Los digitos del numero anterior son iguales.");
            }
            
            else
                System.out.println("Los digitos del numero anterior son "
                        + "diferentes.");
        }
        
        else
            System.out.println("El numero ingresado debe ser de dos digitos"
                    + " y positivo");
    }
}
