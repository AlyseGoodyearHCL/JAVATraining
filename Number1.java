package com.alyse.controller.Day7;
import java.util.*;

//lists, hash, trees

public class Number1 {

	public static void main(String[] args) {
		//Array list
		ArrayList<String> vehicles = new ArrayList<String>(); 
		vehicles.add("cars");
		vehicles.add("truck");
		vehicles.add("van");
		System.out.println("Array list\n" + vehicles);
		
		vehicles.set(2, "bus");
		System.out.println(vehicles);
		
		vehicles.remove(1);
		System.out.println(vehicles);
		
		//linked list
		LinkedList<String> vehicles1 = new LinkedList<String>(); 
		vehicles1.add("cars");
		vehicles1.add("truck");
		vehicles1.addFirst("van");
		System.out.println("\nLinked list\n" + vehicles1);
		
		vehicles1.set(2, "bus");
		System.out.println(vehicles1);
		
		vehicles1.remove(1);
		System.out.println(vehicles1);
		
		vehicles1.removeLast();
		System.out.println(vehicles1);
		
		//vector
		int n = 10;
        Vector<Integer> v = new Vector<Integer>(n);
        for (int i = 1; i <= n; i++) {
        	v.add(i);
        }
		System.out.println("\nVector\n" + v);
		
        v.remove(2);
		System.out.println(v);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		
		System.out.println();
		
		//Hash Set
        HashSet<ArrayList> set = new HashSet<ArrayList>();
        set.add(vehicles);
        System.out.println("\nHash Set\n" + set.size());
        
        //linked hash set
        LinkedHashSet<String> hs = new LinkedHashSet<String>();
        hs.add("Hello");
        hs.add("Hey");
        hs.add("Hi");
        System.out.println("\nLinked Hash Set\n" + hs);

        //tree set
        Set<String> ts = new TreeSet<String>();
        ts.add("A");
        ts.add("B");
        ts.add("C");
        System.out.println("\nTree Set\n" + ts);
        
        //hash map
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("book", 10);
        map.put("table", 30);
        map.put("desk", 20);
        System.out.println("\nHash Map\n" + map);  
        System.out.println(map.size());
        
        //linked hash map
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "lake");
        lhm.put("two", "pool");
        lhm.put("four", "ocean");
        System.out.println("\nLinked Hash Map\n" + lhm);
	}
}
