package Stack;

public class StackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack stack=new Stack(3);
//		for(int i=1;i<=5;i++) {
//			stack.push(i);
//		}
//		
//		while(!stack.isEmpty()) {
//			try{
//				System.out.println(stack.pop());
//			}
//			catch(StackEmptyException e){
//				
//			}
//			
//		}
		
		stackUsingLL<Integer> stack1=new stackUsingLL<>();
		for(int i=1;i<=5;i++) {
			stack1.push(i);
		}
		while(!stack1.isEmpty()) {
			try {
			System.out.println(stack1.pop());
			}
			catch(StackEmptyException e){
				
			}
		}

	}

}
