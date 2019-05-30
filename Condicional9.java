/*
 * 42. Leer dos números enteros y determinar si 
 * la diferencia entre los dos es un número par.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional9 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero deseado, positivo: ");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero deseado, positivo: ");
        
        int num2 = entrada.nextInt();
        
        int dif1 = num1 - num2;
        int dif2 = num2 - num1;
        
        if (num1 > 0 && num2 > 0)
        {
            if (num1 > num2)
            {
                if (dif1%2 == 0) 
                {
                    System.out.println("La direfencia entre ambos numeros es un "
                            + " numero par");
                }
                
                else
                    System.out.println("La diferencia entre ambos numeros "
                            + "no es un numero par.");
            }
            
            if (num2 > num1)
            {
                if (dif2%2 == 0) 
                {
                    System.out.println("La direfencia entre ambos numeros es un "
                            + " numero par");
                }
                
                else
                    System.out.println("La diferencia entre ambos numeros "
                            + "no es un numero par.");
            }
        }
        
        else
            System.out.println("Ambos numeros deben ser positivos.");
     
    }
}
