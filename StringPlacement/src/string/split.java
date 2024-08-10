package string;

import java.util.Scanner;

public class split {
public static void main(String[] args) {
	String s="ram is good boy";
	String []s1=new String[size(s)];
	 Scanner sc=new Scanner(s);
	sc.useDelimiter(" ");
	int p=0;
	while(sc.hasNext()) {
		s1[p++]=sc.next();
	}
	for(String n:s1) {
		System.out.println(n);
	}
}

 static int  size(String s) {
	// TODO Auto-generated method stub
	 Scanner sc=new Scanner(s);
	 int count=0;
	 sc.useDelimiter(" ");
	 while(sc.hasNext()) {
		 count++;
		 sc.next();
	 }
	return count;
}
}
