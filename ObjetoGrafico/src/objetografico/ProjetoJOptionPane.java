/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetografico;

import javax.swing.JOptionPane;
/**
 *
 * @author 1190142
 */
public class ProjetoJOptionPane {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a, b, c, d;
        double media;
        double n1, n2, n3, n4;
        
      do{  
        a = JOptionPane.showInputDialog (null, "digite um numero: ");
        n1 = Double.parseDouble (a);
      }while (n1 == 0);
      
      do{
        b = JOptionPane.showInputDialog (null, "digite um numero: ");
        n2 = Double.parseDouble (b);
     
        c = JOptionPane.showInputDialog (null, "digite um numero: ");
        n3 = Double.parseDouble (c);
        
        d = JOptionPane.showInputDialog (null, "digite um numero: ");
        n4 = Double.parseDouble (d);
        }while (n2 != 0 && n3 != 0 && n4 != 0);
      
      media = (n1+n2+n3+n4)/4;
      
      JOptionPane.showMessageDialog(null, "a media e:  " + media);
     
        
    }
    
}
