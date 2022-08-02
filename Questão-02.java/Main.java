package Questão_02;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nInforme um numero interio: ");
        int numero = entrada.nextInt();
        
        for (int i = 0; i < numero + 5; i++) {
            System.out.print("(" + i + "):" + Questão_02.fibo(i) + "\t");
            
            int[] a = new int[]{i++};
            
            System.out.println(numero + " in Fibonacci " +((IntStream.of(a).anyMatch(x -> x == numero))));
        }
 
    }
    
}