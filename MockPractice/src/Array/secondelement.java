package Array;

public class secondelement {
public static void main(String[] args) {
	int[]a= {1,8,9,2,5,8,2,0};
	int s1=a[0];
	int s2=a[0];
	for(int i=0;i<=a.length-1;i++) {
		if(s2>a[i]) {
			s2=a[i];
			s1=s2;
		}
		else if(s1>a[i]&&s1==s2) {
			s1=a[i];
		}
	}
	System.out.println(s1);
	System.out.println(s2);
}
}
