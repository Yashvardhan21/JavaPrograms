package myproject;

public class DynamicArray {
	private int data[];
	private int nextItem;
	public DynamicArray() {
		data=new int[5];
		nextItem=0;
	}
	public int size() {
		return nextItem;
	}
	public void add(int element) {
		if(nextItem==data.length) {
			restructure();
		}
		data[nextItem]=element;
		nextItem++;
	}
	public void set(int index, int element) {
		if(index>nextItem) {
			return;
		}
		else if(index < nextItem) {
			data[index]=element;
		}
		else {
			add(element);
		}
	}
	
	public int get(int index) {
		if(index>=nextItem) {
			return -1;
		}
		else {
			return data[index];
		}
	}
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public int removeLast() {
		int value=data[nextItem-1];
		data[nextItem-1]=0;
		nextItem--;
		return value;
		
		
	}
	
	private void restructure() {
		int temp[]=data;
		data=new int[2*data.length];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}
	

}
