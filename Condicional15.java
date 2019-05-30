/*
 * 11. Leer dos números enteros y determinar cuál es el mayor.
 */
package Condicionales;

import java.util.Scanner; 

/**
 *
 * @author gustavo
 */
public class Condicional15 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer numero:");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Digite el segundo numero:");
        
        int num2 = entrada.nextInt();
        
        if (num1 > 0 && num2 > 0) {
            
            if (num1>num2) {
                
                System.out.println("El primer numero ingresado es mayor al"
                        + " segundo.");
                
            }
            
            else if (num2>num1) {
                
                System.out.println("El segundo numero ingresado es mayor al"
                        + " primero.");
                
            }
            
            else
                System.out.println("Ambos numeros son iguales.");
        }
        
        else
            System.out.println("Ambos numeros deben ser positivos, mayores a 0.");
    
    }
    
}
