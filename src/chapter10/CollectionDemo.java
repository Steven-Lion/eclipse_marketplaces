package chapter10;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		String a = "A",b = "B", c = "C",d = "D" ,e = "E";
		List<String> list = new LinkedList<String>();
		list.add(a);
		list.add(b);
		list.add(c);
		Iterator<String> firstIterator = list.listIterator();
		while(firstIterator.hasNext()) {
			System.out.println(firstIterator.next()+"  ");
		}

		list.set(1,e);
		list.add(2, d);
		System.out.println();

		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()+"  ");
		}
	}

}
