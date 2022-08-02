import  java.util.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();
	    System.out.println(shuffle(frase));

	}

    public static String shuffle(String s) {

        List<String> letters = Arrays.asList(s.split(""));
        Collections.shuffle(letters);
        StringBuilder t = new StringBuilder(s.length());
        for (String k : letters) {
        	t.append(k);

        }
        return t.toString();
    }
}