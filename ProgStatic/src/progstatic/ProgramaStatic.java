/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progstatic;

import javax.swing.JOptionPane;
/**
 *
 * @author 1190142
 */
public class ProgramaStatic {
    
    static int n1;
    int n2;
    int n3;
    static int n4;
    

    public static double media (int n1, int n2, int n3, int n4)
    {
      return (n1 + n2 + n3 + n4)/4;    
    }
   
    public double multiplicacao (int n1, int n2, int n3, int n4)
    {
      return (n1*n2*n3*n4);   
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        int soma, multi;
        String texto;
        int w, x, y, z;
        
        ProgramaStatic ps = new ProgramaStatic();
        
        texto = JOptionPane.showInputDialog(null, "Digite o 1o numero: ");
        n1 = Integer.parseInt (texto);
        
        texto = JOptionPane.showInputDialog(null, "Digite o 2o numero: ");
        ps.n2 = Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog(null, "Digite o 3o numero: ");
        ps.n3 = Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog(null, "Digite o 4o numero: ");
        n4 = Integer.parseInt (texto);
        
        soma = n1 + ps.n2 + ps.n3 + n4;
        
        JOptionPane.showMessageDialog(null, "a soma é: " + soma);
        JOptionPane.showMessageDialog(null, "a media é: " + media(n1, ps.n2, ps.n3, n4));
        JOptionPane.showMessageDialog(null, "a multiplicacao é: " + ps.multiplicacao(n1, ps.n2, ps.n3, n4));
     
        
        
    }
    
}
