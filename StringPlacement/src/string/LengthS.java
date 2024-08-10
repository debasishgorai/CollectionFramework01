package string;

import java.util.Scanner;

public class LengthS {
public static void main(String[] args) {
	String s="rm is        good";
	String res="";
	Scanner sc=new Scanner(s);
	//ssc.useDelimiter("");
	while(sc.hasNext()) {
		String temp=sc.next();
		res+=length(temp)+temp+" ";
	}
	System.out.println(res);
}

 static int length(String s) {
	// TODO Auto-generated method stub
	Scanner sc1=new Scanner(s);
	sc1.useDelimiter("");
	int count=0;
	while(sc1.hasNext()) {
		sc1.next();
		count++;
	}
	return count;
}
}
