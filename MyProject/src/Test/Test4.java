package Test;

import java.util.*;
public class Test4 {
	//Sort LinkedList
	
	public static Node<Integer> sort(Node<Integer> head) {
        //Your code goes here
        ArrayList<Integer> l=new ArrayList<>();
        Node<Integer> temp=head;
        Node<Integer> newnode=null;
        Node<Integer> newnode1=null;
        while(temp!=null){
            l.add(temp.data);
            temp=temp.next;
        }
        Collections.sort(l);
        
        for(int x: l){
            if(newnode==null){
                newnode=new Node<>(x);
                newnode.next=null;
                temp=newnode;
            }
            else{
                newnode1=new Node<>(x);
                newnode.next=newnode1;
                newnode=newnode1;
                newnode1.next=null;
                
            }
        }
        
        return temp;
    }
	
	
	//remove duplicates values
	
public static void changeLL(Node<Integer> head) {
        
        Node<Integer> temp=head;
        Node<Integer> temp1=head;
        int n=0;
        while(temp!=null){
            if(n<temp.data){
                n=temp.data;
            }
            
            temp=temp.next;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        while(temp1!=null){
            if(!map.containsKey(temp1.data)){
                map.put(temp1.data,1);
            }
            else{
                temp1.data=n+1;
                n=n+1;
                
            }
            temp1=temp1.next;
        }

    }

	//Dequeue in python
//q=[]
//
//arr= list(map(int,input().split()))
//
//i=0
//while arr[i]!= -1:
//    if arr[i]==1:
//        if len(q)==10:
//            print(-1)
//        else:
//            
//        	q.insert(0,arr[i+1])
//        i+=2
//        
//    if arr[i]==2:
//        if len(q)==10:
//            print(-1)
//        else:    
//        	q.append(arr[i+1])
//        i+=2
//    if arr[i]==3:
//        if len(q)==0:
//            print(-1)
//        else:
//            q.pop(0)
//        i+=1
//            
//    
//    
//    if arr[i]==4:
//        if len(q)==0:
//            print(-1)
//        else:
//            q.pop()
//        i+=1
//    
//    
//    if arr[i]==5:
//        if len(q)==0:
//            print(-1)
//        else:
//            print(q[0])
//        i+=1
//    if arr[i]==6:
//        if len(q)==0:
//            print(-1)
//        else:
//            print(q[-1])
//        i+=1

}
