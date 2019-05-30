/*
 * 43. Leer dos números enteros y determinar si la diferencia entre los dos es
 * un número divisor
 * exacto de alguno de los dos números.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional10 {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero deseado, positivo:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero deseado, positivo:");
        
        int num2 = entrada.nextInt();
        
        int dif1 = num1 - num2;
        int dif2 = num2 - num1;
        
        if (num1 > 0 && num2 > 0)
        {
            if (num1 > num2)
            {
                
                if (dif1 == 0 || dif1 == 1)
                {
                    System.out.println("No existe diferencia alguna entre los "
                            + "numeros ingresados.");
                }
                
                else if (num1%dif1 == 0 && num2%dif1 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto de ambos numeros.");
                }
                
                else if (num1%dif1 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto del primer numero.");
                }
                
                else if (num2%dif1 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto del segundo numero.");
                }
                
                
                else
                    System.out.println("La resta originada entre ambos numeros "
                            + "no origina un divisor exacto de alguno de ellos.");
            }
            
            if (num2 > num1)
            {
                
                if (dif2 == 0 || dif2 == 1)
                {
                    System.out.println("No existe diferencia alguna entre los "
                            + "numeros ingresados.");
                }
                
                else if (num1%dif2 == 0 && num2%dif2 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto de ambos numeros.");
                }
                
                else if (num1%dif2 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto del primer numero.");
                }
                
                else if (num2%dif2 == 0)
                {
                    System.out.println("La resta originada entre ambos numeros"
                            + " es un divisor exacto del segundo numero.");
                }
                
                
                else
                    System.out.println("La resta originada entre ambos numeros "
                            + "no origina un divisor exacto de alguno de ellos.");
            }
        }
        
        else
            System.out.println("Ambos numeros deben ser valores positivos.");
    
    }
}
