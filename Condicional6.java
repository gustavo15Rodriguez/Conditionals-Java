/*
 * 43. Leer dos números enteros y determinar si la diferencia entre los dos es un 
 * número divisor exacto de alguno de los dos números.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional6 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero positivo:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero positivo:");
        
        int num2 = entrada.nextInt();
        
        int resta1 = num1 - num2;
        int resta2 = num2 - num1;
        
        if (num1 >0 && num2 >0) 
        {
            if (num1 > num2) 
            {
                if (resta1%num1 == 0)
                {
                    System.out.println("El resultado de la resta generada es "
                            + "multiplo exacto del primer numero.");
                }
                
                else if(resta1%num2 == 0)
                {
                    System.out.println("El resultado de la resta generada es "
                            + "multiplo exacto del segundo numero.");
                    
                }
                
                else
                    System.out.println("El resultado de la resta generada no es "
                            + " multiplo exacto de nnguno de los numeros ingresados.");
            }
            
            if (num2 > num1) 
            {
                if (resta2%num1 == 0)
                {
                    System.out.println("El resultado de la resta generada es "
                            + "multiplo exacto del primer numero.");
                }
                
                else if(resta2%num2 == 0)
                {
                    System.out.println("El resultado de la resta generada es "
                            + "multiplo exacto del segundo numero.");
                    
                }
                
                else
                    System.out.println("El resultado de la resta generada no es "
                            + " multiplo exacto de nnguno de los numeros ingresados.");
            }
        }
        
        else 
            System.out.println("El numero ingresado debe ser mayor de cero.");
    }
    
    
}
