package prgm;

public class biggernuminString {
public static void main(String[] args) {
	String s="123jj897j89j77";
int n=0;
int max=0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(c>='0'&& c<='9') {
		n=n*10+(c-48);
		
	}
	else {
		if(max<n) {
			max=n;
			n=0;
		}
		//max<n?System.out.println(n);
	
	}
	


}
System.out.println(max);			
}
}
