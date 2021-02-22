package Stack;

public class stackUsingLL<T>{

	private Node<T> head;
	private int size;
	public stackUsingLL() {
		head=null;
		size=0;
	}

	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int size() {
		return size;
	}
	public T top() throws StackEmptyException {
		if(head==null) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return head.data;

	}
	public void push(T elem) {
		Node<T> newnode=new Node<T>(elem);
		newnode.next=head;
		head=newnode;
		size++;
		
	}
	public T pop() throws StackEmptyException {
		if(head==null) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		T x=head.data;
		head=head.next;
		return x;

	}

}
