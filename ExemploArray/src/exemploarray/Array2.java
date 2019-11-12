
package exemploarray;

public class Array2 {
    
     public static void main(String[] args) {
         
         String nomesCompletos[][] = new String [3][3];
         
         //Pessoa 1:
         
         nomesCompletos[0][0] = "Carlos";
         nomesCompletos[0][1] = " dos Santos";
         
         //Pessoa 2:
         
         nomesCompletos[1][0] = "Sabrina";
         nomesCompletos[1][1] = " Mendes do nascimento";
         
          //Pessoa 3:
         
         nomesCompletos[2][0] = "Paulo";
         nomesCompletos[2][1] = " Cezar Filho";
         
          //Impressão dos nomes com sobrenome:
          
          for(int i = 0; i<= 2;i++){
              
              System.out.print("nome armazenado na linha " +i+ ":");
              System.out.println( nomesCompletos[i][0] + nomesCompletos[i][1] );
          }
     }
 
}

