/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempencapsulamento;

/**
 *
 * @author 1190142
 */
public class Calculos {
    
    private float a, b;
    
    public float getA () {
        return a;
    }
     
    public void setA (float a) {
        this.a = a;    
    }
    
    public float getB () {
        return b;
    }
    
    public void setB (float b) {
        this.b = b;
    }
    
    public float soma () {
        return a + b;
    }
    
    public float subtracao () {
        return a - b;
    }
    
    public float multiplicacao () {
        return a * b;
    }
    
    public float divisao () {
        try {
            return a / b;
        }catch (Exception e) {
            return 0;
        }
    }
}
