package DoubleLinkedList;

import SingleLinkedList.SingleLink;

public class Test {

	public static void main(String[] args) {
		// TODO Aut	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		
		DoubleLinkedList l=new DoubleLinkedList();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
l.add(2, 12);

for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}
	}



	

}
