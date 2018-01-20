package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arrlist {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(40);
		list.remove(2);
		list.add(0, 8);
		list.set(0, 13);
		
		List<Integer> l2=list.subList(0, 2);
		for (Integer integer : l2) {
			System.out.println(integer);
		}
		
		l2.set(0, 9999);
		System.out.println("-----------");
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
