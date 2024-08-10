package string;

public class ddd {
public static void main(String[] args) {
	int[]a= {1,0,1,0,1};

	System.out.println(rev(a,a.length-1));

	
}

 static  int rev(int[] a,int size) {
	// TODO Auto-generated method stub
	int left=0;
	int right=a.length-1;
	while(left<right) {
	for(int i=0;i<a.length;i++) {
		if(a[i]==0&left<right) {
			if(a[i]==1& left<right) {
				left++;
				right--;
			}
			if(a[i]==0&left<right) {
				left--;
				right++;
			}
			while(left<right) {
				a[left]=1;
				a[right]=0;
				left--;
				right++;
			}
		}}
	////// 1;
}
	return 1;

	
}}
