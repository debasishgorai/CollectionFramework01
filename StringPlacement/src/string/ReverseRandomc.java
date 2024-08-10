package string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseRandomc {
public static void main(String[] args) {
	String s=" Hardwork";
	
	Scanner sc=new Scanner(s);
	sc.useDelimiter("");
	ArrayList<String>a1= new ArrayList<>();
	while(sc.hasNext()) {
		a1.add(sc.next());
		
	}
	String res="";
	for(int i=a1.size()/2;i>=0;i--) {
		res+=a1.get(i);
	}
	for( int i=a1.size()/2+1;i<a1.size();i++) {
		res+=a1.get(i);
	}
	System.out.println(res);
}
}
