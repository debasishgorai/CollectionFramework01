package occurence;

import java.util.Scanner;

public class ramm2 {
public static void main(String[] args) {
	String s="ram is                best";
	String s1="";
	Scanner sc1=new Scanner(s);
	//sc1.useDelimiter(" ");
	while(sc1.hasNext()) {
		String t=sc1.next();
		s1+=t+"  "+length(t);
	}
	System.out.println(s1);
}

private static int length(String s) {
	// TODO Auto-generated method stub
//Scanner sc=new Scanner(system.in);

	Scanner sc=new Scanner(s);
	sc.useDelimiter("");
	int count =0;
	while(sc.hasNext()) {
		sc.next();
		count++;
		
	}
	return count;
}
}
