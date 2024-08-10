package string;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,2,3,5};
for(int i=0;i<=a.length-1;i++){
	//int count=1;
	boolean flag=true;
	for(int j=i+1;j<a.length;j++) {
		//if(i==j)continue;
		
		 if(a[i]==a[j]) {
			//count++;
			 flag=false;
		}
	}
	if(!flag) {
		System.out.println(a[i]);
	}
}
	}

}
