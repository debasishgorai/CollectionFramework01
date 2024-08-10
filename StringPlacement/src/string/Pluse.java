package string;

public class Pluse {
public static void main(String[] args) {
	String s="java is best";
	String []s1=s.split(" ");
	for(int i=0;i<s1.length;i++) {
		String rev="";
		String w=s1[i];
		for(int j=w.length()-1;j>=0;j--) {
			w+=w.charAt(j);
		}
		rev=rev+w+" ";
		System.out.println(rev);
	}
	
}
}
