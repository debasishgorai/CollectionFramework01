package string;

public class covertFist {
public static void main(String[] args) {
	int n=6;
	int sp=0;
	int st=n+(n-1);
	int value=n;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=sp;j++) {
			System.out.print(" ");
		}
		
		for(int j=1;j<=st;j++) {
			if(i==1) {
				
				if(j<=st/2) 
			System.out.print(value--);
		
				else 
					System.out.print(value++);
				
			}
				else if(j==1||i+j==st+1) 
					System.out.print(n);
				
				else 
					System.out.print(" ");
				
			}
System.out.println();
		
		st--;
		sp++;
		}
		
	}
	

}
