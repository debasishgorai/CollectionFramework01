package Stack;

import java.util.EmptyStackException;

public class Stack {
	private int count=0;
	
  private   Object[]a=new Object[5];
  public void push(Object e) {
	  if(count>=a.length) increae();
		  a[count++]=e;
	  
	  
  }
private void increae() {
	// TODO Auto-generated method stub
	Object[]temp=new Object[a.length+3];
	System.arraycopy(a,0,temp,0,a.length);
	a=temp;
}
public int size() {
	return count;
}
private boolean isEmpty() {
	return size()==0;
	
}
public Object peek() {
	if(isEmpty()) {
		throw new EmptyStackException();
		
		
	}
	return a[count-1];
	
}
    public Object pop() {
    	if(isEmpty()) {
    		throw new EmptyStackException();
    		
    	}
    	Object e=a[count-1];
    	count--;
    	a[count]=null;
    	return e;
    }
}
