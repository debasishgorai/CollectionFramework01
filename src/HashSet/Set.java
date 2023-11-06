package HashSet;



public class Set {
private Node[]a=new Node[5];
private int count=0;
public boolean add(int k) {
	int index= k%a.length;
	if(a[index]==null) {
		a[index]=new Node(k);
		count++;
		return true;
		
		
	}
	Node prev=null;
	Node curr=a[index];
	while(curr!=null) {
		if(k==curr.key)return false;
		prev=curr;
		curr=curr.next;
	}
	prev.next=new Node(k);
	count++;
	return true;
}

public void display() {
	for(int i=0;i<a.length;i++) {
Node curr=a[i];
		while(curr!=null){
			System.out.println(curr.key+"");
			curr=curr.next;
		}
		System.out.println();
	}
	}
public int size() {
	return count;
	
}


	


}
