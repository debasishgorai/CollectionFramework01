package Array;

public class arryyyyy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ramssswwwwwkkss";
String res="";
for(int i=0;i<s.length()-1;i++) {
	if(s.charAt(i)!=s.charAt(i+1)) {
		res+=s.charAt(i);
	}

}
res+=s.charAt(s.length()-1);
System.out.println(res);
	}

}
