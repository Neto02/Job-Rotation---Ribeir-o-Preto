import java.util.Scanner;

public class Questão_01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int k;
        int INDICE = 13;
        int SOMA = 0;
        
        System.out.println("Informe a variavel: ");
        k = entrada.nextInt();
        
        while (k < INDICE) {            
            
            
            SOMA = SOMA + k;
            
            System.out.println("Informe a variavel: ");
            k = entrada.nextInt();
            
        }
        
        System.out.println("A soma total foi de : " + SOMA);
        
    }
    
}
