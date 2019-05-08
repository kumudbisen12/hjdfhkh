package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class first {

	public static void main(String[] args)
	{
		List list = new ArrayList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(10);
		
		
		//Simple list print
		//System.out.println(list);
		
		//For printing the sorted list without insertion or duplicates order via set 
		Set s = new HashSet(list);
		System.out.println(s);
		
		/*For printing the sorted list with insertion order but not duplicates via set
		 
		 Set s1 = new LinkedHashSet(list);
		System.out.println(s1);*/
		

	}

}
