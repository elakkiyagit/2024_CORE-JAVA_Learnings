package collection_concepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	/**
	 * TreeSet is the implementation class of SortedSet Interface.
	 * Does not allow duplicates.
	 * Sorts the elements
	 * It has 6 methods like first,last,headSet,tailSet,subSet and comparator.
	 * Difference between Hashset and Treeset, hash doesnt maintain order
	 * but Treeset maintains ascending or alphabetical order.
	 * DS-> Balanced Tree
	 * Heterogeneous data not allowed. If added then Exception- ClassCast will occur
	 * For default natural sorting order,the objects should be homogeneous and comparable else class cast exception
	 * To say any class is comparable or not, the class should implement comparable interface.
	 */
	/*
	 * Constructors present are 4
	 * 1. TreeSet ts= new TreeSet();// default sort order
	 * 2. TreeSet ts= new TreeSet(Comparator c);// customized sorting order defined by comparator object
	 * 3. TreeSet ts= new TreeSet(Collection c);// equivalent tree set of any collection will be created
	 * 4. TreeSet ts= new TreeSet(SortedSet s);// creates tree set for given sorted set
	 */
	public void treeSetExample(){
		//Creating object
		TreeSet<Integer> treeSet= new TreeSet<Integer>() ;
		treeSet.add(10);
		treeSet.add(1);
		treeSet.add(2);
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(3);
		
		System.out.println("Elements are sorted on ascending order :"+ treeSet);
		
		//first()--> to retrieve the first element 
		System.out.println("First element :"+treeSet.first());
		//last()--> to retrieve the last element 
		System.out.println("Last element :"+treeSet.last());
		//headSet() --> to retrieve Values lesser than given value
		System.out.println("Values lesser than given value"+treeSet.headSet(3));
		//tailSet() --> to retrieve Values equal to and higher than given value
		System.out.println("Values equal to and higher than given value"+treeSet.tailSet(9));
		//subSet() --> to the values in-between 2- 9 which includes 2 and excludes 9
		System.out.println("Subset values :"+treeSet.subSet(2, 9));
		//comparator() [Important interview question]
		System.out.println("Comparator returns null if the sorting is default natural order :"+ treeSet.comparator());
		//Adding null to a non empty tree set causes null pointer exception
		//treeSet.add(null);
		/*null can be easily added if the tree set is empty. If there are any elements present, the
		 * comparator will check for the sorting order between the previosly added element and 
		 * the null. Since it compares null with the objects exisiting we are getting NPE.
		 * Same is the case, if we add null first and add other elements, NPE will happen.
		 */
		//Higher --> to retrieve the immediate higher value of the given element
		System.out.println("Higher:"+treeSet.higher(3) );
		//lower --> to retrieve the immediate lower value of the given element
		System.out.println("lower:"+treeSet.higher(2) );
		//pollFirst --> to retrieve the first element and delete that element as well after retrieval 
		System.out.println("pollFirst:"+treeSet.pollFirst() );
		//pollLast --> to retrieve the Last element and delete that element as well after retrieval 
		System.out.println("pollLast:"+treeSet.pollLast() );
		//After polling 
		System.out.println("after polling treeset: "+treeSet);
		//DesendingSet --> it will give the treeSet values in descending order
		System.out.println("descending order set: "+treeSet.descendingSet());
		
		//normal iteration - forward traversing
		Iterator<Integer> iterator=treeSet.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("---------------------------------------------------------");
		//using descendingIterator() --> reverse traversing
		Iterator<Integer> descendingiterator=treeSet.descendingIterator();
		while(descendingiterator.hasNext())
		{
			System.out.println(descendingiterator.next());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample treeSetExample= new TreeSetExample();
		treeSetExample.treeSetExample();
	}
}
