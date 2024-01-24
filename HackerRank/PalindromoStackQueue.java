import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        A = A.toLowerCase();
        
        Queue<Character> fila = new LinkedList<>();
        Stack<Character> pilha = new Stack<>();
        
        for (char c : A.toCharArray()) {
            fila.add(c);
            pilha.push(c);
        }
        
        boolean palindromo = true;
        
        while(!fila.isEmpty() && !pilha.isEmpty()) {
            char charFila = fila.poll();
            char charPilha = pilha.pop();
            if (charFila != charPilha) {
                palindromo = false;
                break;
            }
        }
        
        if(palindromo){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}



