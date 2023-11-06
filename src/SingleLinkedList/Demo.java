package SingleLinkedList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SingleLink l=new SingleLink();
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(5);
l.add(24,3);
l.add(23,3);
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}
	}

}
