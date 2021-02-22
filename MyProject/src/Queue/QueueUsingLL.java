package Queue;

public class QueueUsingLL <T>{
	private Node<T> front;
    private Node<T> rear;
    private int size;

	public QueueUsingLL() {
        front=null;
        rear=null;
        size=0;

	}

	public void enqueue(T data) {
		Node<T> temp=new Node<>(data);
        if(size==0){
            front=temp;
            rear=temp;
        }
        rear.next=temp;
        rear=rear.next; 
        size++;
	}

	public int size() {
        return size;

	}

	public boolean isEmpty() {
		return size==0;
	}

	public T dequeue() throws QueueEmptyException {
		if(size==0){
            throw new QueueEmptyException();
        }
        T var=front.data;
        front=front.next;
        size--;
        return var;
        
	}

	public T front() throws QueueEmptyException {
		if(size==0){
            throw new QueueEmptyException();
        }
        return front.data;
	}
}

