package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MyVectorIterator {
	private int size;
	private final int INIT_SIZE = 10;
	private Object [] data;

	public MyVectorIterator(){
		size = 0;
		data = new Object[INIT_SIZE];
	}
	public void add(Object value){
		if (size == data.length) resize();
		data[size++] = value;
	}
	private void resize(){
		Object [] temp = new Object[data.length+INIT_SIZE];
		for (int i = 0; i<data.length; i++){
			temp[i] = data[i];
		}
		data = temp;
	}
	public int size(){return size;}

	public String toString(){
		String s = "[";
		for (int i = 0; i<size; i++){
			s = s + data[i] + ", ";
		}
		s  = s + "]";
		return s;
	}
	public Iterator<String> cIterator(){// Anonymous inner class, return Iterator
		return new Iterator<String>(){
			int i=0;
			public boolean hasNext(){
				return i<size;
			}
			public String next(){
				return (String)data[i++];
			}
			public void remove() {
				throw new UnsupportedOperationException ();
			}
		};
	}

	public static void main(String[] args) {
		MyVectorIterator myVect = new MyVectorIterator();
		myVect.add("a");
		myVect.add("b");
		myVect.add("c");
		////////
		System.out.println("anonymous iterator:");
		Iterator<String> iterC = myVect.cIterator();
		while(iterC.hasNext()){
			System.out.print(iterC.next()+", ");
		}
		System.out.println();
		////////////
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		Iterator<Integer> iter = list.iterator();
		int x = iter.next();
		iter.remove();
		System.out.println(list);
	}

}
