package occurence;

public class rammm {
public static void main(String[] args) {
	String s="ram is good bot";
	String s1="";
	
	char[]a=s.toCharArray();
	while(s.length()>0) {
		
		s1+=count(s);
	}
}

private static int count(String s) {
	int count=0;
	for(int i=0;i<=s.length();i++)
			{
		char c=s.charAt(i);
		String s2=s.replace(c+"","");
		if(c[i]==' ') {
			int count=s.length()-s1.l
		}
			}
	// TODO Auto-generated method stub

	return count;
}
}
