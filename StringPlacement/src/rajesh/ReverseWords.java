package rajesh;

import java.util.Arrays;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= ("i love you you");
String res="";
String[]a=s.split(" ");
Arrays.sort(a);
for(int i=0;i<a.length;i++) {
	int count=0;
	String t=a[i];
	for(int j=i+1;j<a.length;j++) {
		if(!t.equals(a[j])) {
			count++;
		}
		res+=t;
		i+=count;
	}
	System.out.println(res);
}
	}

}
