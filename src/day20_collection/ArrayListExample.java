package day20_collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList mylist= new ArrayList();
		
		//1. Adding data into arrayList?
		mylist.add(100);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(null);
		
		//2.size of arraylist:
		//System.out.println(mylist.size());
		//3. Printing ArrayList:
		//System.out.println(mylist);
		
		//4.Inserting particular element in the Array:
		mylist.add(2,'A');
		//5.5. Modify element in the ArrayList (modify/replace/change)
		mylist.set(2,"Phython");
		//System.out.println(mylist);
		
		//6. Accessing specific element from arraylist:
		//System.out.println(mylist.get(0));
		
		//7.Reading all the elements from arrayList:
		//using normal for loop

		
		for(int i=0;i<=mylist.size()-1;i++)
			{
			mylist.get(i);
			System.out.println(mylist);
			}
		

	}

}
