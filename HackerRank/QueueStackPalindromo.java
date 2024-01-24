import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        // Inicializando a Deque (pode ser usada como fila ou pilha)
        Deque<Character> deque = new ArrayDeque<>();

        // Preenchendo a Deque
        for (char c : A.toCharArray()) {
            deque.add(c);
        }

        // Verificando se a string é um palíndromo
        boolean palindromo = true;
        while (deque.size() > 1) {
            char inicio = deque.removeFirst();
            char fim = deque.removeLast();
            if (inicio != fim) {
                palindromo = false;
                break;
            }
        }

        // Exibindo o resultado
        if (palindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }
}
