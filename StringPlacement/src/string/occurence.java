package string;

import java.util.HashMap;
import java.util.Map;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ramm";
		Map<Character,String>m= new HashMap();
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(!m.containsKey(c)) {
				m.put(c,i+"");
				 
				
			}
			
		}
		   String result = "";
	        for (Map.Entry<Character, String> entry : m.entrySet()) {
	            result += entry.getKey() + "=" + entry.getValue() + ", ";
	        }

	        // Remove the trailing comma and space
	        if (!result.isEmpty()) {
	           result = result.substring(0, result.length() - 2);
	        }
//
	        System.out.println(result);
	    }
	

}
