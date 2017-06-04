package UTD;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {
	public static void main(String args[]){
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		List<String> result = generateFib(n);
		java.util.Iterator<String> it = result.iterator();
		while(it.hasNext()){
			System.out.println(it.next()+" ");
		}
	}
    private static List<String> generateFib(int n) {
		// TODO Auto-generated method stub
    	 int n1=0,n2=1,n3,i; 
    	 List<String> ls = new ArrayList<String>(); 
    	 ls.add(Integer.toString(n1));
    	 ls.add(Integer.toString(n2));
    	  
    	 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already added   
    	 {    
    	  n3=n1+n2;
    	  if(n3%3==0 && n3%5==0)
              ls.add("FizzBuzz");
              else if(n3%3==0)
              ls.add("Buzz");
              else if(n3%5==0)
              ls.add("Fizz");
              else if(isPrime(n3))
              ls.add("BuzzFizz");	
              else
              ls.add(Integer.toString(n3));
    	      
    	  n1=n2;    
    	  n2=n3;    
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
