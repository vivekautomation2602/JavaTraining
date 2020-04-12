package JavaBasics;

public class IncrementalAndDecrementalPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// ++
	// --	
		
		
		
	// 1. Post Incremental means give i value to j before  increasing the value of i  
		
		int i = 1;
		int j = i++;
	System.out.println(i);
	System.out.println(j);
	
	
	// 2. pre Incremental means give h value to v after increasing the value of h
	
	int h = 1;
	int v = ++h;
	
	System.out.println(h);
	System.out.println(v);
	
	System.out.println("****");	
	
	// 3. Post decrement 
	
	int l = 1;
	int m =l--;
	
	System.out.println(l);
	System.out.println(m);
	
	System.out.println("*****");
	
	// 4. Pre Decrement 
	
	int d = 10;
	int c = --d;
	
	System.out.println(d);
	System.out.println(c);
	
	
	
	
	
	
	
	
	}

}
