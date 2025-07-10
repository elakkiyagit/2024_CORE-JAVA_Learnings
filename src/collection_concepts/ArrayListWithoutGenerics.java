package collection_concepts;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithoutGenerics {

	public static void main(String[] args) {
		// This is not recommended and we should not use, this in real time
		// We should always use Generics
		List al= new ArrayList();
		al.add(1);
		al.add("Elakkiya");
		System.out.println(al);
		
	}

}
