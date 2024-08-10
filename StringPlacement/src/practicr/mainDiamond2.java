package practicr;

public class mainDiamond2 {

public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
int n=5;
int sp=n-1;
int st=1;
for(int i=1;i<=n;i++) {
	for(int j=1;j<=sp;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=st;j++) {
		System.out.print("*");
	}
	System.out.println();

	st+=2;
	sp--;
}
for(int i=n;i>=1;i--) {
	for(int j=n;j>=1;j--) {
		System.out.println(" ");
	}
	for(int j=i;j<=st;j++) {
		System.out.print("*");
}
	}
st--;
sp++;
}
