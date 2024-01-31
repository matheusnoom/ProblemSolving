import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import static java.lang.System.in;

//Basicamente faz a verificacao de numeros primos utilizando a logica de verificar ate a raiz quadrada do numero e origem.
//Note na utilizacao de ... para receber numeros variados de parametros.

class Prime {
    void checkPrime(int... prime) {
        for (int uniqueN : prime) {
            if(uniqueN == 1) continue;
            boolean isPrime = true;
            for(int i = 2; i <= Math.sqrt(uniqueN); i++) {
                if(uniqueN % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(uniqueN + " ");
            }
        }
        System.out.println();
    }
}

public class Solution {

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}

