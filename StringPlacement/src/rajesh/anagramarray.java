package rajesh;

import java.util.Arrays;

public class anagramarray {
public static void main(String[] args) {
	String[]a= {"raom","jjj"};
	String[]b= {"jjj","ram"};
	Arrays.sort(a);
	Arrays.sort(b);
	if(Arrays.toString(a)!=Arrays.toString(b)) {
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
}
}
