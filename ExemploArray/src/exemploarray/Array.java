
package exemploarray;

public class Array {

    public static void main(String[] args) {
        
        String nomes[] = new String[3];
        
        // seta,manualmente,cada posição do array , 0 a 2(três posições)
        
        nomes[0] = "Karoline";
        nomes[1] = "Lucas";
        nomes[2] = "Jessica";
        
        //E para acessar cada posição,podemos usar um laço, a 0 e 2(0,1,2 - três posições)
        
        for(int i = 0; i<= 2;i++){
            
            System.out.print("Na posição " + i + " do array, temos: ");
            
            System.out.println(nomes[i]);
        }
    }
    
}
