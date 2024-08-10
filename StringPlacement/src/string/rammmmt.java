package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class rammmmt {
public static void main(String[] args) {
String s="rammmm";
Scanner sc=new Scanner(s);
sc.useDelimiter("");
int count=0;
while(sc.hasNext()) {
	sc.next();
	count++;
}
System.out.println(count);
}
}
