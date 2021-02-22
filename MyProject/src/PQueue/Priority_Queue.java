package PQueue;
import java.util.*;

public class Priority_Queue {
	private ArrayList<Integer> heap;

	public Priority_Queue(){
		heap=new ArrayList<>();
	}

	boolean isEmpty() {
		return heap.size()==0;
	}

	int size() {
		return heap.size();

	}

	int getMin() throws PriorityQException {
		if(isEmpty()) {
			throw new PriorityQException();
		}

		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) {
			if(heap.get(parentIndex)> heap.get(childIndex)) {
				int temp=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;

			}
			else {
				return;
			}
		}
		
	}
	

    int removeMin() throws PriorityQException{
        // Complete this function
        // Throw the exception PriorityQueueException if queue is empty
        if(isEmpty()){
            throw new PriorityQException();
        }

        int temp=heap.get(0);

        int lastIndex=heap.size()-1;
        heap.set(0,heap.get(lastIndex));
        heap.remove(lastIndex);
        int index=0;
        int minIndex=index;
        int leftchildIndex=1;
        int rightchildIndex=2;
        
        while(leftchildIndex<heap.size()){
            if(heap.get(leftchildIndex)<heap.get(minIndex)){
                minIndex=leftchildIndex;
            }
            if(rightchildIndex<heap.size() && heap.get(rightchildIndex)<heap.get(minIndex)){
                minIndex=rightchildIndex;
            }
            if(minIndex==index){
                break;
            }
            else{
                int temp1=heap.get(minIndex);
                heap.set(minIndex,heap.get(index));
                heap.set(index,temp1);
                index=minIndex;
                leftchildIndex=2*index+1;
                rightchildIndex=2*index+2;
            }
        }
        
        return temp;

    }

}

