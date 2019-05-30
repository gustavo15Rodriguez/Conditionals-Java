/*
 * Leer tres numeros enteros y mostrarlos en pantalla ascendentemente
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author gustavo
 */
public class Condicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        
        int num2 = entrada.nextInt();
        
        
        System.out.println("Ingrese el tercer numero: ");
        
        int num3 = entrada.nextInt();
        
        if (num1<num2 && num1<num3)
        {
            System.out.println(num1 +" "+ num2 +" "+ num3);
        }
        
        else if (num2<num1 && num2<num3 && num3<num1)
        {
            System.out.println(num2 +" "+ num3 +" "+ num1);
        }
        
        else if (num2<num1 && num2<num3 && num1<num3)
        {
            System.out.println(num2 +" "+ num1 +" "+ num3);
        }
        
        else if (num3<num1 && num3<num2 && num2<num1)
        {
            System.out.println(num3 +" "+ num2 +" "+ num1);
        }
        
        else
            System.out.println(num3 +" "+ num1 +" "+ num2);
    }
    
}
