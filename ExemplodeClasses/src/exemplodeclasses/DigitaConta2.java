
package exemplodeclasses;

 import java.util.Scanner;
import javax.swing.JOptionPane;

public class DigitaConta2 {

    static int cliente;
     
    public static void main(String[] args) {
  
         
         
Scanner tc2 = new Scanner(System.in);
int n;

     JOptionPane.showMessageDialog(null,"Bem Vindo ao JAVA-BANK");

  do{ 

    
    
 System.out.println ("Digite 1 para acessar sua Conta Corrente ");
 System.out.println ("Digite 2 para acessar sua Conta Poupanca");
 System.out.println ("Digite 0 para sair ");
 n = tc2.nextInt();
         
         
         
   if (n==1) 
   {
             JOptionPane.showMessageDialog(null,"Conta Corrente");
             
        ClasseContaCorrente cc = new ClasseContaCorrente();        
        Scanner tc = new Scanner(System.in);
        double x, z;
        
        System.out.println ("Entrada de dados"); 
        cc.setNumeroConta(30);
        
       while((cc.getNumeroConta() > 0 && cc.getNumeroConta()<= 99999) || cc.getNumeroConta() >= 999999 ){
        System.out.println("Entre com o numero da conta corrente : ");
        cc.setNumeroConta(tc.nextInt());        
        }
       
        do{
        System.out.println("Entre com o numero do cliente: ");
        cc.setNumeroCliente(tc.nextInt());        
       }while(cc.getNumeroCliente() <= 0);
                
        System.out.println("Entre com a data de abertura: ");
        cc.dataAbertura = tc.next();   
        
        System.out.println("Entre com o gerente: ");
        ClasseContaCorrente.gerente = tc.next();
        
        
        
        System.out.println("Entre com o valor do saque: ");
        z=tc.nextDouble();
        cc.saqueConta(z);
        System.out.println("Entre com o valor do depósito: ");
        x=tc.nextDouble();        
        cc.depositoConta(x);
                 
        System.out.println("O saldo é : " + cc.getSaldo());
    }
    else {
         
       if (n==2) {
         
             JOptionPane.showMessageDialog(null,"Conta Poupança");
           
         ClasseContaPoupanca cp = new ClasseContaPoupanca(); 
         Scanner tp = new Scanner (System.in);
         double y, a;
         
         System.out.println ("Entrada de dados");
         cp.setNumeroConta(5);
         // consistências para o número do cliente não ter mais de 5 dígitos;
         while((cp.getNumeroConta() > 0 && cp.getNumeroConta()<= 9999) || cp.getNumeroConta() >= 99999 ){
         System.out.println ("Entre com o numero da conta poupanca : ");
         cp.setNumeroConta(tp.nextInt());
         }
         do{
         System.out.println ("Entre com o numero do cliente : ");
         cp.setNumeroCliente(tp.nextInt());
         }while (cp.getNumeroCliente() == 0);
         System.out.println ("Entre com a data de abertura : ");
         cp.dataAbertura = tp.next();
         
         System.out.println ("Entre com a sua data de aniversario : ");
         cp.dataAbertura=tp.next();
         
         System.out.println("Entre com o valor do saque: ");
         a = tp.nextDouble();
         cp.saqueConta(a);
         System.out.println ("Entre com o valor do depósito : ");
         y = tp.nextDouble();
         cp.depositoConta(y);
         
         System.out.println("O saldo é : "+cp.getSaldo());
         
            }
          }
       }while (n!=0);
     }
  }