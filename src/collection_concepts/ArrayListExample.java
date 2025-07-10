package collection_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListExample {
	/** List(I) is the Child of Collection(I). 
	 * ArrayList (C) is one of the classes provides implementation for the List(I).
	 * In list duplicate values are allowed and the insertion order is maintained. 
	 * The underlying DS is resizeable Array or Growable Array. We can insert Heterogeneous objects as well.
	 * NOTE: All the collections can store Heterogeneous objects except TREE SET and TREE MAP.
	 * ArrayList and vector implements RandomAccess, Serializable and Cloneable Interfaces
	 * Synchronized-> No
	 * Thread safe-> NO
	 * Default capacity-10
	 * Fill Ratio or Load factor:1 or 100%
	 * Growth Rate: current_size + current_size/2
	 */
	public void arrayListExample()
	{
		/* List <Integer> --> This generic is used for following same datatype so, if we mention Integer and add String datatype means it will throw error in the compile time itself
		 * List <Integer> arraylist= new ArrayList<Integer>(); --> here List is a parent class reference and child class is a object, so it follows dynamic polymorphism
		 */
		List <Integer> arraylist= new ArrayList<Integer>(); 
		
		//1.add - is a method used to insert the elements in the list
		arraylist.add(11);
		arraylist.add(22);
		arraylist.add(33);
		arraylist.add(44);
		arraylist.add(55);
		arraylist.add(33);
		arraylist.add(55);
		arraylist.add(null);
		arraylist.add(null);
		
		
		// arrayList Maintains insertion order - means it will print the same order how we inserted the elements
		System.out.println(arraylist);
		
		// 2.get(indexposistion) - To get the element in the ArrayList by using index position
		System.out.println(arraylist.get(3));
		
		// 3. indexOf(element Name)- To get the index of the element in the ArrayList (Priority is first present element )
		System.out.println(arraylist.indexOf(33));
		
		// 4.lastIndexOf(element Name)- returns the last value's index position. If same value is given in the code.
		System.out.println(arraylist.lastIndexOf(55));
		
		// indexOf(element Name)-To retrieve the element which is not present in the arrayList
		System.out.println(arraylist.indexOf(1));//if the given value is not present in list it will give -1
		
		// 5.addAll(refName) - To add the List into another list
		List <Integer> anotherlist= new ArrayList<Integer>();
		anotherlist.addAll(arraylist);
		
		System.out.println(anotherlist);
		
		//6.clear()- To remove all the elements in the array
		anotherlist.clear();
		System.out.println(anotherlist);
	
		// 7.remove()- To remove particular element in the arrayList
		// Here, we can give (index#), (object), or (index, object)
		arraylist.remove(4);
		System.out.println(arraylist);
		
		// add(index, element) - null insertion is possible. Here we are adding the Null in the 0th position
		arraylist.add(0, null);
		System.out.println(arraylist);
		
		//9.isEmpty() --> Given the List is empty or Not. So it will give true of false
		//boolean b = arraylist.isEmpty();
		System.out.println(arraylist.isEmpty());
		
		//10.set(index,"value")
		arraylist.set(0, 12);
		System.out.println(arraylist);
		
		/*what are the diff types we can iterate the list ?
		 * 1. foreach loop
		 * 2. for loop
		 * 3. listIerator --> using this we can traverse both forward and backward
		 * 4. Iterator --> traverse forward direction only Note: It's not a List iterator)
		 */
		// 1. Using foreach Loop
		for (Integer integer : arraylist) {
			System.out.println("Using for each loop: "+ integer);
			
			}
		
		System.out.println("-----------------------------");
		
		//2. using for loop
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println("Using for loop: "+ arraylist.get(i));
			
		}
		System.out.println("-----------------------------");
		
		//3. using List iterator-forward traversing
		ListIterator<Integer> listIterator = arraylist.listIterator();
		while(listIterator.hasNext())
		{
			System.out.println("Using listiterator forward: "+listIterator.next());
		}
		System.out.println("-----------------------------");
		
		//4. using List iterator-reverse traversing
		
		while(listIterator.hasPrevious())
		{
			System.out.println("Using listiterator reverse: "+listIterator.previous());
		}
		
		System.out.println("-----------------------------");
		
		//5. Using Iterator
		Iterator<Integer> iterator = arraylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("-----------------------------");
		
		
		/*
		 * ARUL PRASATH'S GIT HUB CODE FOR LEARNING
		 * 
		//add() used to add the specified element at the end of the List
		List<String> arrayList= new ArrayList<String>();
		arrayList.add("Audi");
		arrayList.add("Benz");
		arrayList.add("Bugatti");
		arrayList.add("Aston martin");

		System.out.println(arrayList);

		//add(int index, Object element) method will add at specified index position
		arrayList.add(0,"Mustang");
		System.out.println(arrayList);

		//to check the indexof any element
		System.out.println("Index position of Audi is :"+arrayList.indexOf("Audi"));
		//-1 is returned if the element is not there
		System.out.println("Index position of Ambassador is :"+arrayList.indexOf("Ambassador"));

		//List allows duplicate elements
		arrayList.add("Mustang");
		System.out.println(arrayList);

		//indexof always returns the first occurrence
		System.out.println("Index position of Mustang is :"+arrayList.indexOf("Mustang"));
		//last index of is used to check the last occurence position
		System.out.println("Last Index position of Mustang is :"+arrayList.lastIndexOf("Mustang"));

		// add a list to another list
		List<String> anotherList=new ArrayList<String>();
		anotherList.addAll(arrayList);
		System.out.println("New List copied :"+ anotherList);

		//clear to delete all the elements
		anotherList.clear();
		System.out.println("List after clearing "+anotherList);

		//we can even insert null
		anotherList.add(null);
		System.out.println("After adding null "+anotherList);
		anotherList.add("mango");
		anotherList.add("Banana");
		//adding list to a list at specified position.
		anotherList.addAll(0,arrayList);
		System.out.println("New list after adding the old list at 0th position :"+anotherList);

		//set() is used to update the element based on index
		anotherList.set(6, "Tata");
		anotherList.set(7,"Civic");
		System.out.println("List after updating the last two elements : "+anotherList);

		//remove(int position) removes the value at the specified position
		anotherList.remove(6);
		System.out.println("After removing :"+anotherList);

		//remove using object value
		anotherList.remove("Civic");
		System.out.println("After removing Civic: "+ anotherList);

		//get an element based on index position. 
		//If the index is not there we will get index out of bound exception
		System.out.println("Element at 5th Position "+anotherList.get(5));

		//isEmpty() method to check the list is empty or not
		System.out.println("This list is empty. True or False? "+ anotherList.isEmpty());
		System.out.println(anotherList);

		//get all the elements in the list using for loop
		for(int size=0; size<anotherList.size();size++){
			System.out.println("element at "+size+"th position " +anotherList.get(size));
		}

		//fetch using advanced for loop
		for (String string : anotherList) {
			System.out.println("List elements "+string);
		}

		//forward traversing using ListIterator . NOTE: ListIterator is a Interface(I), so we can't create object for it.
		ListIterator<String> listIterator= anotherList.listIterator(); //listIterator()--> here , this function is doing the looping
		while(listIterator.hasNext()){
			System.out.println("Forward Iteration : "+listIterator.next());
		}

		// reverse Iteration using ListIterator
		while(listIterator.hasPrevious()){
			System.out.println("Reverse Iteration : "+listIterator.previous());
		}

		//Iteration with Iterator (NOTE: Not ListIterator)
		//Iterator can only traverse forward but not on reverse.
		//Hence we are using ListIterator for better usages.

		Iterator< String> iterator=anotherList.iterator();
		while(iterator.hasNext()){
			System.out.println("Forward Only:"+iterator.next());
		}

		 * ArrayList is non-synchronized.It should not be used in multi-threaded 
		 * environment without explicit synchronization.Hence,
		 * adding an element to the list when traversing through it
		 * will give concurrent modification exception.
		 * This is happening because when a thread is trying to read the elements
		 * from the list another thread is trying to add or remove an element from the same. 
		 *
		try{
			for (String string : anotherList) {
				System.out.println("Reading the list values"+ string);
				anotherList.add("Mustang");
			}
		}
		catch(Exception e){

			System.out.println("Dude! You are trying to modify a list while a read operation is happening");
		}	
	
	 	// CopyOnWriteArrayList allows us to modify  the list while reading it
	 
	
	public void syncArrayListExample(){	

		CopyOnWriteArrayList<String> syncal = new CopyOnWriteArrayList<String>();

		//Adding elements to synchronized ArrayList
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");
		System.out.println("Iterating synchronized ArrayList:");

		Iterator<String> syncIterator = syncal.iterator(); 
		while (syncIterator.hasNext()){
			System.out.println(syncIterator.next());
			syncal.add("Eraser");
			syncal.remove("Eraser");


		}
		System.out.println("Final List: "+syncal);
	}
	}

*/
	}

	public static void main(String[] args) {
		ArrayListExample example = new ArrayListExample();	
		example.arrayListExample();
	}

}
