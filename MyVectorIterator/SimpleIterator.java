package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class SimpleIterator {

	
	public static void main(String[] args) {
		ArrayList<Character> aList = new ArrayList<>();
		aList.add('a');
		aList.add('b');
		aList.add('c');
		aList.add('d');
		Iterator<Character> cIter = aList.iterator();
		while(cIter.hasNext()){
			System.out.print(cIter.next() + ", ");
		}
		System.out.println();
		LinkedList<String> linkList = new LinkedList<>();
		linkList.add("x");
		linkList.add("y");
		linkList.add("z");
		for (String s : linkList) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}
}
