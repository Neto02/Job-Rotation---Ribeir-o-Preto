package Questão-02;

public class Class {
    
    private static int[] vetAux = new int[50];
    private static int k;

    public static long fibo(int n) {
             k = 1;
             return recursao(n);
           }

    private static long recursao(int n) {
            if (n < 0) {
               return vetAux[0];
          } else {
           if (k < 3) {
              vetAux[n] = k - 1;
              k++;
           } else {
                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                 }
              return recursao(n - 1);
           }
    }
    
}