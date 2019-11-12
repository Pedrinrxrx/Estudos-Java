/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodeclasses;
import java.util.Scanner;

public class CasdrastrodeCliente {
    static int n;
    public static void main(String[] args) {
      
        Scanner ca = new Scanner(System.in);
      
        MatrizConta cadrastro[] = new MatrizConta[4];
        
        //Pessoa 1:
          
            cadrastro[0] = new  MatrizConta();// É preciso para inicializar
            
            cadrastro[0].nome = "Cosmo Menezes";
            cadrastro[0].idade = 36;
            cadrastro[0].email = "cosmo.souza28@gmail.com";
            cadrastro[0].numeroConta = "0302710-9";
            cadrastro[0].numeroCliente = 1004;
            
           //Pessoa 2: 
           
           cadrastro[1] = new MatrizConta();// É preciso para inicializar
            
            cadrastro[1].nome = "Pedro Torres";
            cadrastro[1].idade = 17;
            cadrastro[1].email = "Pedrotorres.costaa@gmail.com";
            cadrastro[1].numeroConta = "0206510-9";
            cadrastro[1].numeroCliente = 1003;
            
           // Pessoa 3:
           
           cadrastro[2] = new MatrizConta();// É preciso para inicializar
            
           cadrastro[2].nome = "Luis Paulo";
           cadrastro[2].idade = 18;
           cadrastro[2].email = "l.pauloferraznunes@gmail.com";
           cadrastro[2].numeroConta = "01025310-7";
           cadrastro[2].numeroCliente = 1002;
            
            //Pessoa 4:
            
            cadrastro[3] = new MatrizConta();
            
            cadrastro[3].nome = "Victor dos Santos";
            cadrastro[3].idade = 19;
            cadrastro[3].email = "vitor200084@gmail.com";
            cadrastro[3].telefone = "(11)94511-8677";
            cadrastro[3].numeroConta = "00012417";
            cadrastro[3].numeroCliente = 1001;
            //vamos mostrar na tela os dados das pessoas, usando While:
            
            int i = 0;
            
            while (i <= 3){
                System.out.println("Dados das pessoas " +(i+1)+ ":"); //i+1 para deixar mais amigavel a exibição;
                System.out.println("\t" +  cadrastro[i].nome);
                System.out.println("\t" +  cadrastro[i].idade);
                System.out.println("\t" +  cadrastro[i].email);
                System.out.println("\t" +  cadrastro[i].numeroCliente);
                System.out.println("\t" +  cadrastro[i].numeroConta); 
                i++; //intera o i
            }
    }
             
        
        
        
    }
 

