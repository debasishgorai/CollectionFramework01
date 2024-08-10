package rajesh;

import java.util.Scanner;

public class rajeshprime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	int sum=0;
	while(num>0) {
		int rem=num%10;
		sum+=rem;
		num/=10;
		
	}
	if(temp%sum==0) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
