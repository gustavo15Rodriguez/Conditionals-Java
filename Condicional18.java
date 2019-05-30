/*
 * 16. Leer un número entero de tres dígitos y determinar si al menos dos 
 * de sus tres dígitos son Iguales.
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional18 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite un numero de tres digitos:");
        
        int num = entrada.nextInt();
        
        int dig1 = num/100;
        int dig2 = (num/10) % 10;
        int dig3 = num%10;
        
        if (num > 99 && num < 1000) {
            
            if (dig1 == dig2 && dig1 == dig3) {
                
                System.out.println("Todos los digitos del numero anterior "
                        + "son iguales.");
            }
            
            else if (dig1 == dig2 && dig1 != dig3) {
                
                System.out.println("Los dos primeros digitos del numero "
                        + "anterior si son iguales");
            }
            
            else if (dig2 == dig3 && dig2 != dig1) {
                
                System.out.println("Los dos ultimos digitos del numero "
                        + "anterior si son iguales");
            }
            
            else if (dig1 == dig3 && dig2 != dig3) {
                
                System.out.println("El primer y tercer digito del numero "
                        + "anterior si son iguales");
            }
            
            else
                System.out.println("Ninguno de los digitos del numero anterior "
                        + "son iguales.");
        }
        
        else
            System.out.println("El numero ingresado debe ser de tres digitos"
                    + " y positivo");
        
    }
    
}
