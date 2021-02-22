package Tries;

public class TrieUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries t=new Tries();
		t.add("this");
		t.add("news");
		System.out.println(t.search("news"));
		t.remove("news");
		System.out.println(t.search("news"));

	}

}
