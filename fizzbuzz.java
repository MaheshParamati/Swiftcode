package UTD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {
	public static void main(String args[]){
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> result = fizzBuzz(n);
		java.util.Iterator<String> it = result.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+" ");
		}
	}
    public static List<String> fizzBuzz(int n) {
        List<String> ls = new ArrayList<String>();
        for(int i =1;i<=n;i++){
            if(i%3==0 && i%5==0)
            ls.add("FizzBuzz");
            else if(i%3==0)
            ls.add("Buzz");
            else if(i%5==0)
            ls.add("Fizz");
            else if(isPrime(i))
            ls.add("BuzzFizz");	
            else
            ls.add(Integer.toString(i));
        }
        return ls;
    }

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		if(num<=2)
			return false;
		if ( num > 2 && num%2 == 0 ) {
			
	        return false;
	    }
	    
	    for(int i = 3; i*i <= num; i+=2){
	        if(num % i == 0){
	        	
	            return false;
	        }
	    }
	    
	    return true;
	}
}
