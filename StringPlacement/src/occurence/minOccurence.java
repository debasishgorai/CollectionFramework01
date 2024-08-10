package occurence;

public class minOccurence {
	public static void main(String[] args) {
		String s="ramisoo";
		char[]a=s.toCharArray();
		char d='\u0000';
		int c1=1;
		while(s.length()>0) {
			
			char c=s.charAt(0);
			//int max=a[0];
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			if(count<c1) {
				c1=count;
				d=c;
			}
			
		//	else if()
			//System.out.println(c+" "+count);
			s=s1;
		
			
				
			
			}
		System.out.println(d+" "+c1);
		}
		
}
