
package exemplodeclasses;


public class ClasseContaPoupanca extends ClasseConta {
    
        String dataAniversarios;
        
        @Override
        void saqueConta (double valor) {
         
            if ((getSaldo() - valor)<0) 
                System.out.println ("Erro : Saldo ficará abaixo de 0.00");
            
            else setSaldo(getSaldo() - valor);
              
             
         
        }
        
       ClasseContaPoupanca() {
            
        }
        
       ClasseContaPoupanca (String x, double y){
            dataAbertura = x;
            setSaldo(y);
        }
        
       ClasseContaPoupanca (int numeroConta, String dataAbertura, double saldo){
            this.setNumeroConta(numeroConta);
            this.dataAbertura = dataAbertura;
            this.setSaldo(saldo);
        }
      
}