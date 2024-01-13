package collectionFramework;

import java.util.ArrayList;

public class ArrayListcf {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		//homogeneous data it can store
		System.out.println(al);
		System.out.println();
		
		ArrayList al2 = new ArrayList();
		al2.add("sidduganesh");
		al2.add("22");
		al2.add("M");
		//heterogeneous data it can store
		System.out.println(al2);
		System.out.println();
		
		//we can add entire collection into another collectin
		ArrayList al3 = new ArrayList();
		al3.add(al2);
		System.out.println(al3);
		System.out.println();
		
		//INSERTING obj's at diff index's
		
	}

}
