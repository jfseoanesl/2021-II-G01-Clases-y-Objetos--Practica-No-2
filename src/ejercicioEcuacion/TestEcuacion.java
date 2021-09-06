/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioEcuacion;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class TestEcuacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de X=");
        int x = entrada.nextInt();
        
        Ecuacion e = new Ecuacion();
       
        e.setA(5);
        e.setB(2);
        e.setC(3);
        
        System.out.printf("Y(%d) = %.2f%n", x, e.evaluarEcuacion(x));
        
        
        Ecuacion eSobrecargada = new Ecuacion(5,2,3);
        System.out.printf("* Y(%d) = %.2f%n", x, eSobrecargada.evaluarEcuacion(x));
        
        
    }
}
