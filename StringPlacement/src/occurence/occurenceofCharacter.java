package occurence;

public class occurenceofCharacter {
	public static void main(String[] args) {
		String s="debasish";
		
		int i=0;
	
		while(s.length()>i) {
		
			char c=s.charAt(i);
			int c1=1;
			if(s.charAt(i)==c&&i<s.length()) {
				i++;
				c1++;
				
			}
			System.out.println(c+c1);
		}
	
}
}
