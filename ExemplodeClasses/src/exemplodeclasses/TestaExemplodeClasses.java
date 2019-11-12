
package exemplodeclasses;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestaExemplodeClasses {
   
    static double sacar;
    static double saquePoupanca;
    static double result;
   
    
    public static void main(String[] args) {
 
   ClasseContaPoupanca cp3 = new ClasseContaPoupanca (10020, "09/08/2019", 800.00);
       
  
    Scanner te = new Scanner(System.in);
    
    System.out.println("Conta Poupança :" + "\n Numero da conta: " + cp3.getNumeroConta() + "\n Data de abertura: " + cp3.dataAbertura + "\n Saldo: " + cp3.getSaldo() );
    
    ClasseContaPoupanca cp = new ClasseContaPoupanca ();
    cp.saqueConta(saquePoupanca); 
    
    System.out.println("---------------------- ");
    System.out.println("Digite o valor do saque na conta poupança: ");
    saquePoupanca = te.nextDouble();
    
    result = cp3.getSaldo() - saquePoupanca;
    
    System.out.println("O saldo atual da Conta Poupança é : " +result);  
    
    System.out.println("---------------------- ");
    System.out.println("Conta Corrente : ");
    
    
    System.out.println("\n Digite o valor que você deseja sacar da conta corrente : ");
    sacar = te.nextDouble();
    
    ClasseContaCorrente cr = new ClasseContaCorrente ();
    cr.verificaLimite();
    cr.saqueConta (sacar);
   
    
        
        
    }
   
    
    
}
