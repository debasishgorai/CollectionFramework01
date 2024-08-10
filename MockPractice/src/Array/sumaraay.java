package Array;

public class sumaraay {
public static void main(String[] args) {
	int[]a= {7,13,8,6,17,12,3,14};
	int sum=0;
	for(int i=1;i<a.length;i++) {

			sum=a[i]+a[i-1];
		}
	
	if(sum==20) {
	System.out.println(a);
	}
}
}
