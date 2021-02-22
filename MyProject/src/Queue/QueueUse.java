package Queue;

public class QueueUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QueueUsingArray queue=new QueueUsingArray(3);
		QueueUsingLL queue1=new QueueUsingLL();
		for(int i=1;i<=20;i++) {
			queue1.enqueue(i);
		}
		
		while(!queue1.isEmpty()) {
			try {
				System.out.println(queue1.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}

	}

}
