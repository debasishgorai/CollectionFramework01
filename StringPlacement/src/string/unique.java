package string;

public class unique {
public static void main(String[] args) {
	String s="rammmm";
	char[]a=s.toCharArray();
	
	for(int i=0;i<=a.length-1;i++) {
		int count=0;
		boolean flag =true;
		for(int j=i+1;j<a.length;j++) {
			if(i==j)continue;
			else if(a[i]==a[j]) {
				flag= false;
				
			}
			if(flag) {
				count++;
			}
			
		}
		if(!(count>=1)) {
			System.out.println(a[i]);
			break;
		}
	
	}
	
	//System.out.println(co);
}
}
