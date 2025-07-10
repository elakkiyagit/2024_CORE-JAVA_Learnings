package collection_concepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
		
public class LinkedHashMapExamples {
	
	/* 1. Insertion order will be maintained in Linked Hash Map
	 * 2. null insertion is possible
	 * 3. multiple null keys(duplicate) then value will be overwritten
	 */
	
	private void linkedHsahMap_Concepts() 
	{
	Map<String, String> linkedhashmap = new LinkedHashMap<String, String>();
	linkedhashmap.put("Aravind", "Elakkiya");
	linkedhashmap.put("Ila", "Aravind");
	linkedhashmap.put("Jo", "Elakkiya");
	//multiple null keys(duplicate) then value will be overwritten
	linkedhashmap.put(null, "abc");
	linkedhashmap.put(null, "xyz");
	// we can store null as both key and value places
	linkedhashmap.put(null, null);
	
	
	
	System.out.println("Linked Hash Map :"+linkedhashmap );
	
	//Map for comparison of insertion order with LinkedHahMap above
		Map<String, String> employeemap = new HashMap<String, String>();
		employeemap.put("Aravind", "Elakkiya");
		employeemap.put("Ila", "Aravind");
		employeemap.put("Jo", "ilakkiya");
		
		System.out.println("HashMap :"+ employeemap);

	}

	public static void main(String[] args) {
		LinkedHashMapExamples LHM = new LinkedHashMapExamples();
		LHM.linkedHsahMap_Concepts();
	}

}
