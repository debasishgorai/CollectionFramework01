package occurence;

public class palindromeinside {
public static void main(String[] args) {
	String s="Malayalam";
	s=s.toLowerCase();
	char[]a=s.toCharArray();
	for(int i=0;i<=s.length()-1;i++) {
		for(int j=i=1;j<s.length();j++) {
			if(isp(s,i,j)){
				System.out.println(s.substring(i, j+1));
			}
		}
	}
}

private static boolean isp(String s, int start, int end) {
	// TODO Auto-generated method stub
	int i=start;
	int j=end;
	while(i<j) {
		if(s.charAt(i)!=s.charAt(j))return false;
		i++;
		j--;
	}
	return false;
}
}
