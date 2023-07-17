import java.util.*;
public class Main
{
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("karthika");
		li.add(20);
		li.addFirst(30);
		System.out.println(li.get(1));
		System.out.println(li.indexOf("karthika"));
		for(int i=0;i<li.size();i++)
		{
		    System.out.println(li.get(i));
		}
	}
}

/*
output
  karthika
  1
  30
  karthika
  20
*/

