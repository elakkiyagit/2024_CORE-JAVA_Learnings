package collection_concepts;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, String> placesinChennai = new TreeMap<String, String>();
		
		placesinChennai.put("Perungudi", "chennai");
		placesinChennai.put("T Nagar", "chennai");
		placesinChennai.put("SholingaNallur", "chennai");
		placesinChennai.put("Thuraipakkam", "chennai");
		
		
		// Null insertion is not possible (Not even single Null) and
		//if we try to add in teh MAP it will throw Null pointer Exception
		//placesinChennai.put(null, "chennai");
		
		// If the key is duplicate, value will be overwritten
		placesinChennai.put("chennai", "abc");
		placesinChennai.put("chennai", "xyz");
		
		System.out.println(placesinChennai);
		
		

	}

}
