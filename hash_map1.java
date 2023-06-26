
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"rd");
		hm.put(2,"karthika");
		
	    System.out.println(hm.get(1));    // output : rd
	    
	    System.out.println(hm.containsKey(1));     //output : true
	    
	    System.out.println(hm.size());    //output : 2
	}
}

