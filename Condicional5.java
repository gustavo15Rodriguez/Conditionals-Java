/*
 * 40. Leer dos números enteros y si la diferencia entre los dos es menor o igual a 10 entonces
 * mostrar en pantalla todos los enteros comprendidos entre el menor y el mayor de los
 * números leídos.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero de dos digitos positivo:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero de dos digitos positivo:");
        
        int num2 = entrada.nextInt();
        
        int resta1 = num1 - num2;
        int resta2 = num2 - num1;
        
        if (num1 >=10 && num1 <100 && num2 >=10 && num2 <100)
        {
          if (num1 > num2)
          {
              if (resta1 <= 10)
              {
                  System.out.println("La diferencia entre ambos numeros"
                          + "es menor o igual a 10.");
              }
              
              else
                  System.out.println("La diferencia entre ambos numeros no es "
                          + " menor o igual a 10");
          }
          
          if (num2 > num1)
          {
              if (resta2 <= 10)
              {
                  System.out.println("La diferencia entre ambos numeros"
                          + " es menor o igual a 10.");
              }
              
              else
                  System.out.println("La diferencia entre ambos numeros no es "
                          + "menor o igual a 10");
          }
        }
        
        else 
            System.out.println("Ambos numeros debe ser de dos digitos y "
                    + "positivos");
    }
    
}
