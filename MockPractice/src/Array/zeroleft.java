package Array;

import java.util.Properties;

public class zeroleft {

	public static void main(String[] args) {
		
	int[]a= {4,8,9,0,7,0};
	   prop(a); 
       
       for (int i=0; i<a.length; i++) 
           System.out.print(a[i]+" "); 
   
	}

	private static void prop(int[] a) {
		// TODO Auto-generated method stub
		int count=0;
		
		   for (int i = 0; i < a.length; i++) 
	            if (a[i] != 0) 
	                a[count++] = a[i]; 
	        while (count < a.length) 
	            a[count++] = 0; 
	}

}
