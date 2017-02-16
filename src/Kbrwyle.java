import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;


public class Kbrwyle {

	public static void main(String[] args) {
		
		//////// Question 2 ///////
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(6,4,2,3,10,1,9,8,7,5));
		list2.addAll(Arrays.asList(9,11,15,6,10,7,14,13,12,8));
		
		System.out.println("List 1: " + list1);
		System.out.println("List 2: " + list2);
		System.out.println("List 1 size: " + list1.size());
		System.out.println("List 2 size: " + list2.size());
		System.out.println();
		
		// Merge two collections
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i = 0; i < 10; i++) {
			tree.add(list1.get(i));
			tree.add(list2.get(i));
		}
		
		//remove middle and reverse
		Iterator<Integer> it = tree.iterator();
		int id = 0;
		int mid = tree.size() / 2;
		Integer mid_leaf = null;
		while(it.hasNext() && id < mid) {
		   mid_leaf = it.next();
		   id++;
		}
		tree.remove(mid_leaf);
		System.out.println("Reversed tree: " + tree.descendingSet());
		System.out.println("Tree size: " + tree.size());
		System.out.println();
		
		// Key Value pairs
		HashMap<Integer, String> set = new HashMap<Integer, String>();
		set.put(1, "one");
		set.put(2, "two");
		set.put(3, "three");
		set.put(4, "four");
		set.put(5, "five");
		
		// adding the duplicate value
		set.put(3, "three");
		
		if( set.containsKey(3)) {
			System.out.println("Set contains: " + set.get(3));
		}
		
		System.out.println("Set: " + set);
		System.out.println("Set size: " + set.size());
		System.out.println();
		
		////// Question 3///////
		/*
		 * This is rewritten to use the nth number instead of 5.
		 */
		int n = 5;
		for (int i = 1; i <= n; i++) {
			String periods = new String(new char[n - i]).replace("\0", ".");
			String numbers = new String(new char[i]).replaceAll("\0", Integer.toString(i));
			System.out.print(periods);
			System.out.print(numbers);
			System.out.println();
		}
	}

}
