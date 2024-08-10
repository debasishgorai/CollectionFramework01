package practicr;

public class ramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int sp=0;
int st=1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n;j++) {
		if(i==j||i+j==n+1) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
	
	
}
	}

}
