package Miscellaneous;

public class Node<T> {
	T data;
	Node<T> right,next;
	Node(T data){
		this.data=data;
		next=null;
		right=null;
	}

}
