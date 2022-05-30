package mythresh;

import java.util.ArrayList;
import java.util.HashSet;


public class UniqueObjects {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(1);
		list.add(10);
		System.out.println("Before removing Duplicates :" + list);
		HashSet<Integer> set = new HashSet<Integer>(list);
		System.out.println("After removing Duplicates :" + set);
	}
}
