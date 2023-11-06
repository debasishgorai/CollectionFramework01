package Stack;

public class Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s= new Stack() ;
s.push(20);
s.push(45);
s.push(89);
s.push(67);
s.push(87);
while(! isEmpty()) {
	System.out.println(s.pop());
}
System.out.println(s.peek());

	

	}

	private static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
