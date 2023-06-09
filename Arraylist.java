/* 
list :
   1.ArrayList
   2.LinkedList
   3.vector
   4.stack
Methods in List : 
The List interface includes all the methods of the Collection interface. Its because Collection is a super interface of List.   
add() - adds an element to a list
addAll() - adds all elements of one list to another
get() - helps to randomly access elements from lists
iterator() - returns iterator object that can be used to sequentially access elements of lists
set() - changes elements of lists
remove() - removes an element from the list
removeAll() - removes all the elements from the list
clear() - removes all the elements from the list (more efficient than removeAll())
size() - returns the length of lists
toArray() - converts a list into an array
contains() - returns true if a list contains specified element
*/

// ArrayList
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		
		l1.add(5);
		l1.add(6);
		l1.add(7);
		System.out.println(l1);   //[5,6,7]
		
		l2.add(1);
		l2.add(2);
		l2.addAll(l1);
		System.out.println(l2);   //[1,2,5,6,7]
		
		System.out.println(l2.get(1)); //2
		
		l1.set(0,55);
		System.out.println(l1);    //[55,6,7]
		
		l1.remove(0);
		System.out.println(l1);    //[6,7]
		
		System.out.println(l1.size());   //2
		
		System.out.println(l1.contains(7));   //True
		System.out.println(l1.contains(9));   //False
		
		l1.clear();
		System.out.println(l1);   //[]
	}
}
