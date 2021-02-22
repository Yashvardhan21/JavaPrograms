package generics;

public class PairUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pair p=new Pair(1,2);
//		p.setFirst(10);
//		System.out.println(p.getFirst());
//		System.out.println(p.getSecond());
		
		Pair<String,String > p =new Pair<String,String>("ab","cd");
		System.out.println(p.getFirst()+p.getSecond());
		
		Pair<Integer,String> p1=new Pair<>(1,"acde");
		Pair<Character,Character> p2 = new Pair<>('a','b');
		
		Pair<Integer,Integer> internalPair=new Pair<>(1,5);
		Pair<Pair<Integer,Integer>, Integer> p3=new Pair<Pair<Integer,Integer>, Integer>(internalPair,8);
		System.out.println(p3.getSecond());
//		System.out.println(p3.getFirst());
		System.out.println(p3.getFirst().getFirst());
		System.out.println(p3.getFirst().getSecond());
	}

}
