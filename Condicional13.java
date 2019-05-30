/*
 * 50. Leer un número entero y si es múltiplo de 4 mostrar en pantalla su mitad,
 * si es múltiplo de 5 mostrar en pantalla su cuadrado y si es múltiplo e 6 mostrar 
 * en pantalla su primer dígito. Asumir que el número no es mayor que 100.
 */
package Condicionales;

import java.util.Scanner;
/**
 *
 * @author gustavo
 */
public class Condicional13 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el numero deseado positivo y menor o igual a 100:");
        
        int num = entrada.nextInt();
        
        int mitad = num/2;
        int cuadrado = num * num;
        
        if (num > 0 && num <= 100)
        {
            if (num%4 == 0)
            {
                System.out.println("La mitad del numero ingresado es: "+ mitad);
            }
            
            else if (num%5 == 0)
            {
                System.out.println("El cuadrado del numero ingresado es: "+ cuadrado);
            }
            
            else if (num%6 == 0)
            {
                System.out.println("El primer digito del "
                        + "numero ingresado es: "+ num/100);
            }
            
            else 
                System.out.println("No hay operaciones por realizar con el"
                        + " numero ingresado anteriormente.");
        }
        
        else 
            System.out.println("El numero ingresado debe ser positivo y menor a "
                    + "100.");
      
    }
}
