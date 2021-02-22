package Stack1;

import java.util.*;
public class StackUsingQueue<T> {
	Queue<T> q1=new LinkedList<>();
    Queue<T> q2=new LinkedList<>();
    
    int size;
    StackUsingQueue(){
        size=0;
    }
    
    void push(T elem){
        q1.add(elem);
        size++;
    }
    
    T pop(){
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        
        T temp=q1.peek(); 
        q1.remove();
        Queue<T> q3=q1;
        q1=q2;
        q2=q3;
        size--;
        return temp;
    }
    
    T top(){
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        
        T temp=q1.peek();
        q1.remove();
        q2.add(temp);
        Queue<T> q3=q1;
        q1=q2;
        q2=q3;
        return temp;
        
    }
    
    int getSize(){
        return size;
    }
    
    Queue<T> getQueue(){
        return q1;
    }
}
