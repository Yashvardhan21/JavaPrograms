package Tries;

class TrieNode{
	char data;
	boolean isTerminate;
	TrieNode children[];
	int childCount;

	TrieNode(char data){
		this.data=data;
		isTerminate=false;
		children=new TrieNode[26];
		childCount=0;
	}
}

public class Tries {

	private TrieNode root;

	public Tries() {
		root=new TrieNode('\0');
	}

	public void add(String word) {
		add(root,word);
	}

	public void add(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminate=true;
			return;
		}

		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
			root.childCount++;
		}

		add(child,word.substring(1));
	}


	public void remove(String word) {
		remove(root,word);
	}

	public void remove(TrieNode root, String word) {
		if(word.length()==0) {
			root.isTerminate=false;
			return;
		}

		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child==null) {
			return;
		}
		remove(child,word.substring(1));

		if(!child.isTerminate && child.childCount==0) {
			root.children[childIndex]=null;
			child=null;
			root.childCount--;
		}
//		if(!child.isTerminate) {
//			int Childnum=0;
//			for(int i=0;i<26;i++) {
//				if(child.children[i]!=null) {
//					Childnum++;
//				}
//			}
//
//
//			if(Childnum==0) {
//				root.children[childIndex]=null;
//				child=null;
//				root.childCount--;
//			}
//		}
	}

	public boolean search(String word){
		// add your code here
		return search(root,word);
	}

	private boolean search(TrieNode root, String word){
		if(word.length()==0){
			return root.isTerminate;
		}

		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.children[childIndex];
		if(child!=null){
			return search(child,word.substring(1));
		}

		return false;
	}

}
