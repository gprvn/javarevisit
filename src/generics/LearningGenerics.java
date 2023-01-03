package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LearningGenerics {
	public static void main(String[] args) {
		
//		list of object instances
		List list = new ArrayList();
		list.add(new Integer(2));
		list.add("a stringf");
		
//		retrieving objects and type casting to expected objects 
		Integer integer = (Integer) list.get(0);
		String str = (String) list.get(1);
		
//		A generic list--
		List<String> strings = new ArrayList<String>();
		strings.add("first name");
		strings.add("second name");
		
//		Accessing a generic list
		String string = strings.get(0);
		
//		Iterating a generic list
		Iterator<String> itr = strings.iterator();
		while(itr.hasNext())
			System.out.println("Name is: "+itr.next());
		
		
//		for-loop
		for(String str1 : strings) {
			System.out.println(str1);
		}
		
//		generic set
		Set<String> set = new HashSet<String>();
		set.add("set String");
		set.add("2nd String");
		
//		iterating a Generic Set
		Iterator<String> itr1 = set.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
//		for-each 
		for(String setStr : set)
			System.out.println("from set: "+setStr);
		
//		Generics in MAP
		Map<Integer, String> map = new HashMap<Integer, String>();
		Integer key = new Integer(11);
		String value = "name1";
		map.put(key, value);
		map.put(12, "name2");
		map.put(13,"name3");
		
		String val = map.get(key);
		
		System.out.println(val);
		
//		iterating map -- Key Iterator
		Iterator<Integer> keyIterator = map.keySet().iterator();
		while(keyIterator.hasNext()) {
			Integer akey = keyIterator.next();
			String aValue = map.get(akey);
			System.out.println("Key: "+akey+", value: "+aValue);
		}
			
//		iterating map -- Value Iterator
		Iterator<String> valueIterator = map.values().iterator();
		while(valueIterator.hasNext())
			System.out.println(valueIterator.next());
		
//		for loop --  keySet
		for(Integer keyInt : map.keySet()) {
			String aVal = map.get(keyIterator);
			System.out.println(""+ keyInt+":"+aVal);
		}
		
//		for loop -- value
		for(String strVal : map.values()) {
			System.out.println(strVal);
		}
		
		
	}
}
