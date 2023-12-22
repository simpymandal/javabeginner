package collectionsRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionOne {
	public static void main(String[] args) {
		CollectionOne collectionOne = new CollectionOne();
//		collectionOne.listRelated();
//		collectionOne.setRelated();
//		collectionOne.hashMapRelated();
//		collectionOne.treeMapRelated();
//		collectionOne.linkedHashMapRelated();
		collectionOne.hashTableRelated();
	}
	
	public void listRelated() {
		List<String> list = new ArrayList<String>();
		list.add("Ashok");
		list.add("satish");
		list.add(null);
		list.add("Ashok");
		System.out.println("List : "+list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		for( int j =list.size()-1; j >=0; j--) {
			System.out.println(list.get(j));
		}
		
	}
	
	public void setRelated() {
		Set<String> empSet = new HashSet<String>();
		empSet.add("Ashok");
		empSet.add("Rajesh");
		empSet.add(null);
		empSet.add("Ashok");
		System.out.println("Set : "+empSet);
		
		for(String employee : empSet) {
			System.out.println(employee);
		}
		System.out.println("******************");
		Iterator<String> iterator = empSet.iterator();
		while(iterator.hasNext()) {
			System.out.println("Iterator : "+iterator.next());
		}
	}
	
	public void hashMapRelated() {
		Map<String, Integer> empMap = new HashMap<String, Integer>();
		
		empMap.put("Ashok", 32);
		empMap.put("Simpy", 30);
		empMap.put("Raju", 33);
		empMap.put("Ashok", 32);
		System.out.println(empMap);
		
		for(Map.Entry<String, Integer> employee : empMap.entrySet()) {
			System.out.println(employee.getKey()+":"+employee.getValue());
		}
		System.out.println("******************");
		
		Iterator<Map.Entry<String, Integer>> iteratoremp = empMap.entrySet().iterator();
		
		while(iteratoremp.hasNext()) {
			Map.Entry<String, Integer> empEntry = iteratoremp.next();
			System.out.println(empEntry.getKey()+":"+empEntry.getValue());
		}
	}
	
	public void treeMapRelated() {
		TreeMap<String, Integer> emptree = new TreeMap<String, Integer>();
		
		emptree.put("Simpy", 56);
		emptree.put("Harry", 43);
		emptree.put("Shejal", 26);
		emptree.put("Harry", 15);
		
		System.out.println("treemap : "+emptree);
		for(Map.Entry<String, Integer> entry : emptree.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	public void linkedHashMapRelated() {
		Map<String, Integer> linkedHashmapEmp = new LinkedHashMap<String, Integer>();
		
		linkedHashmapEmp.put("Simpy", 56);
		linkedHashmapEmp.put("Harry", 43);
		linkedHashmapEmp.put("Shejal", 26);
		linkedHashmapEmp.put("Harry", 15);
		
		System.out.println("linkedHashmapEmp : "+linkedHashmapEmp);
		
		for(Map.Entry<String, Integer> entry : linkedHashmapEmp.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	public void hashTableRelated() {
		Map<String, Integer> hashtableEmp = new Hashtable<>();
		
		hashtableEmp.put("Simpy", 56);
		hashtableEmp.put("Harry", 43);
		hashtableEmp.put("Shejal", 26);
		hashtableEmp.put("Harry", 15);
		
		System.out.println("hashtableEmp : "+hashtableEmp);
		
//		for(Map.Entry<String, Integer> entry : hashtableEmp.entrySet()) {
//			System.out.println(entry.getKey()+":"+entry.getValue());
//		}
	}
}



//
//Interface: Set, list, queue, Deque
//class : 