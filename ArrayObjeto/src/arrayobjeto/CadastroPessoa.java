
package arrayobjeto;

public class CadastroPessoa {

    public static void main(String[] args) {
       
        Pessoa ListaPessoas[] = new Pessoa[4];
        
          //Pessoa 1:
          
            ListaPessoas[0] = new Pessoa();// É preciso para inicializar
            
            ListaPessoas[0].nome = "João Santos";
            ListaPessoas[0].idade = 41;
            ListaPessoas[0].email = "joão@gmail.com";
            
           //Pessoa 2: 
           
           ListaPessoas[1] = new Pessoa();// É preciso para inicializar
            
            ListaPessoas[1].nome = "Marcos Souza";
            ListaPessoas[1].idade = 20;
            ListaPessoas[1].email = "Marcos@gmail.com";
            
           // Pessoa 3:
           
           ListaPessoas[2] = new Pessoa();// É preciso para inicializar
            
            ListaPessoas[2].nome = "Paulo Alves";
            ListaPessoas[2].idade = 90;
            ListaPessoas[2].email = "Paulo@gmail.com";
            
            //Pessoa 4:
            
            ListaPessoas[3] = new Pessoa();
            
            ListaPessoas[3].nome = "Power Ranger Azul";
            ListaPessoas[3].idade = 35;
            ListaPessoas[3].email = "azul@bol.com.br";
            
            
            //vamos mostrar na tela os dados das pessoas, usando While:
            
            int i = 0;
            
            while (i <= 3){
                System.out.println("Dados das pessoas " +(i+1)+ ":"); //i+1 para deixar mais amigavel a exibição;
                System.out.println("\t" +ListaPessoas[i].nome);
                System.out.println("\t" +ListaPessoas[i].idade);
                System.out.println("\t" +ListaPessoas[i].email);
                
                i++; //intera o i
            }
    } 
}
