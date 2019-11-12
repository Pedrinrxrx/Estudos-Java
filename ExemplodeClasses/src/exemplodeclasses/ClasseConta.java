
package exemplodeclasses;


 public abstract class ClasseConta {
    
       private  int numeroConta;
       private int numeroCliente;
       private double saldo;    
         String dataAbertura;
         
         
         void saqueConta (double valor) {

            setSaldo(getSaldo() - valor);
             
         }            

         void depositoConta (double valor) {

            setSaldo(getSaldo() +valor);

             
         }             

   ClasseConta(){

    setSaldo(1000); 
       
   }     

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}