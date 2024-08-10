package string;

public class initCap {
public static void main(String[] args) {
	String s="i am the best";

	char[]a=s.toCharArray();
	int i=0;

	if(i==0) {
	i++;
	ctu(a,0);

}
while(i<a.length-1&& a[i]!=' ') {
	i++;
	
}
if(i<=a.length) {
	i++;
	ctu(a,i+1);
	
}
String s1=new String(a);
System.out.println(s1);

}

private static void ctu(char[] a, int i) {
	// TODO Auto-generated method stub
	if(a[i]>='a'&a[i]<='z') {
		a[i]-=32;
	}
}
}
