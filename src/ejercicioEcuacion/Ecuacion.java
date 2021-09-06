/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioEcuacion;

/**
 *
 * @author jairo
 */
public class Ecuacion {
    private int a;
    private int b;
    private int c;
    
    
    public Ecuacion(){
        this(0,0,0);
    }
    
    
    // constructor sobrecargado 1
    public Ecuacion(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
   
    // contructor sobrecargado 2
    public Ecuacion(int a, int b){
         this(a,b,0);
    }
    
    public Ecuacion(int a){
         this(a,0,0);
    }
    
    
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
    
    public int getC(){
        return this.c;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b=b;
    }
    
    public void setC(int c){
        this.c=c;
    }
    
    
    public double evaluarEcuacion(int x){
        
        double y = this.a * Math.pow(x, 2) + this.b*x + this.c;
        return y;
    }
}
