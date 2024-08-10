package Array;

import java.util.HashMap;
import java.util.Map;

public class occurencedusingmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramm";
Map<String ,Character>m=new HashMap<>();
for(int i=0;i<=s.length()-1;i++) {
	char c=s.charAt(i);
	if(!m.containsKey(c)) {
		m.put(i+"", c);
	}
}
System.out.println(m);
	}

}
