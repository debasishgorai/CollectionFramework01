package string;

public class Isvalid {
public static void main(String[] args) {
	String s="+12345+ghhhh$&";
	System.out.println(isvalid( s));
}

private static boolean isvalid(String s) {
	// TODO Auto-generated method stub
	int numbercount=0;
	int plusCount=0;
	
	for(int i=0;i<=s.length();i++) {
		if(s.charAt(i)>='a'&s.charAt(i)<='z') {
			numbercount++;
			return true;
		}

		
		else	if(s.charAt(i)=='+'&s.charAt(i)<='-') {
				plusCount++;
			}
		if(plusCount>1) {
			return false;
		}
	}
	return false;
}
}
