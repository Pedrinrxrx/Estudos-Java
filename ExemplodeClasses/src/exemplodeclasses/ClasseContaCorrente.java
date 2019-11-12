
package exemplodeclasses;

import javax.swing.JOptionPane;
    
public class ClasseContaCorrente extends ClasseConta{
    
    static double limite = 1000;
    static String gerente; 
    static double taxaMensal;
    
   void verificaLimite(){
      
       if ( TestaExemplodeClasses.sacar > limite )
       {
           System.out.println("Você excedeu o limite de saque diário");
           
       }
       else {
        setSaldo(getSaldo() - TestaExemplodeClasses.sacar);
        System.out.println ("Saldo em conta corrente : "+ getSaldo());
       }
       
  }    
     
    
    
}
