package string;

import java.util.HashMap;
import java.util.Map;

public class removeduplictaeUsingmap {
public static void main(String[] args) {
	String s="ramm";
	//Map<String,boolean>m=new HashMap();
	//Map<String,boolean>m= new HashMap();
	//char[]a=s.toCharArray();
	
	while(s.length()>0) {
	char c=s.charAt(0);
		String s1=s.replace(c+"", "");
		int count=s.length()-s1.length();
		System.out.println(c+ count);
		s=s1;
	}
	
		
}
}
