/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempencapsulamento;

import java.util.Scanner;
/**
 *
 * @author 1190142
 */
public class ExemploEncapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic he
    
    float numero1, numero2;
    
    Scanner in = new Scanner (System.in);
    Calculos calc = new Calculos ();
    
    System.out.println ("informe o 1o valor: ");
    numero1 = in.nextFloat ();
    System.out.println ("informe o 2o numero: ");
    numero2 = in.nextFloat ();
    
    calc.setA (numero1);
    calc.setB (numero2);
    
    System.out.println ("Os numero enviados aos atributos protegidos sao: " + calc.getA() + " e " + calc.getB() );
    
    System.out.println ("\n \t Soma: " + calc.soma () );
    System.out.println ("\n \t Subtracao: " + calc.subtracao() );
    System.out.println ("\n \t Multiplicacao: " + calc.multiplicacao() );
    System.out.println ("\n \t Divisao: " + calc.divisao() );
    
    
    
    
    }
}
