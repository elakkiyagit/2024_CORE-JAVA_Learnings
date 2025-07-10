package collection_concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public void hashMapConcept()
	{
		Map<Integer, String> employeemap = new HashMap<Integer, String>();
		employeemap.put(1, "Elakkiya");// this is called Entry meaning , the map contains one key-value pair
		employeemap.put(2, "Aravind");
		employeemap.put(3, "ilakkiya");
		employeemap.put(4, "Jo");
		employeemap.put(5, "Jothi");
		employeemap.put(null, "Jothi");
			
		System.out.println("employee map : "+ employeemap);
		
		//1. putAll(employeemap)-->To make a copy of the existing map
		Map<Integer, String> duplicatemap = new HashMap<Integer, String>();
		duplicatemap.putAll(employeemap);
		System.out.println("Duplicate map: "+ employeemap);
		
		//2.clear()-To delete the map content
		duplicatemap.clear();
		System.out.println(duplicatemap);
		
		//3. containsKey(1) -> To check if a key is present or not in the Map
		
		boolean containsKey = employeemap.containsKey(1);
		System.out.println(containsKey);
		 //4.containsValue("Jo")- to check if a value is present or not
		boolean containsValue = employeemap.containsValue("Jo");
		System.out.println(containsValue);
		
		//5.isEmpty()--> check if the map is Empty or not
		System.out.println(employeemap.isEmpty());
		
		//6.keySet()--> Fetch the set of keys in the Map(Note: Here its not list of Keys, its a set of keys , because List will allow duplicates and set won't. Keys should be unique)
		//it will return the set of all the keys present in the MAP
		Set<Integer> keySet = employeemap.keySet();
		// The return type of keySet should be either set or we can print directly
		System.out.println(employeemap.keySet());
		// We can use collection to store any return type as its a parent
		Collection<String> values = employeemap.values();
		
		
		// 7.get(key) -->fetch a value of that particular key
		System.out.println("particular value of the given key is:"+employeemap.get(1));
		
		// 8.values() will give all the values in the map
		System.out.println(employeemap.values());
		
		//Fetch all the values in key and value pair
		System.out.println(employeemap.entrySet());
	
	}
	public static void main(String[] args) {
		HashMapExample h = new HashMapExample();
		h.hashMapConcept();
		

	}

}
