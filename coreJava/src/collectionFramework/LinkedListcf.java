package collectionFramework;

import java.util.LinkedList;

public class LinkedListcf {

	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		//internally auto boxing happens
		ll1.add("m1");
		ll1.add("chemistry");
		ll1.add("english");
		ll1 .add("BEE");
		
		System.out.println(ll1);
	}

}
